<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
	xmlns:edc="http://crownking/edc" xmlns:architecture="http://modembed.hu/architecture">
<xsl:output method="xml" encoding="utf-8" indent="yes" />
	
<xsl:template match="edc:PIC">
	<architecture:Architecture xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:architecture="http://modembed.hu/architecture">
		<xsl:attribute name="name"><xsl:value-of select="@edc:name" />.arch</xsl:attribute>
		<instructionSet href="../microchip.pic16/.models/microchip.pic16.enchanced.instructions.xmi#/"/>
		<xsl:for-each select="edc:ProgramSpace/edc:CodeSector">
			<xsl:variable name="beginAddr">
					<xsl:call-template name="hex2dec">
       					<xsl:with-param name="num" select="substring(@edc:beginaddr,3)" />
    				</xsl:call-template>
			</xsl:variable>
			<xsl:variable name="endAddr">
					<xsl:call-template name="hex2dec">
       					<xsl:with-param name="num" select="substring(@edc:endaddr,3)" />
    				</xsl:call-template>
			</xsl:variable>
			<memory program="true">
				<xsl:attribute name="startAddress"><xsl:value-of select="$beginAddr" /></xsl:attribute>
				<xsl:attribute name="length"><xsl:value-of select="$endAddr - $beginAddr" /></xsl:attribute>
			</memory>
		</xsl:for-each>
		<xsl:for-each select="edc:DataSpace/edc:RegardlessOfMode/edc:GPRDataSector[not(@edc:shadowidref)]">
				<xsl:variable name="beginAddr">
					<xsl:call-template name="hex2dec">
       					<xsl:with-param name="num" select="substring(@edc:beginaddr,3)" />
    				</xsl:call-template>
				</xsl:variable>
				<xsl:variable name="endAddr">
					<xsl:call-template name="hex2dec">
       					<xsl:with-param name="num" select="substring(@edc:endaddr,3)" />
    				</xsl:call-template>
				</xsl:variable>
				<memory program="false">
					<xsl:attribute name="startAddress"><xsl:value-of select="$beginAddr" /></xsl:attribute>
					<xsl:attribute name="length"><xsl:value-of select="$endAddr - $beginAddr" /></xsl:attribute>
				</memory>
		</xsl:for-each>
	</architecture:Architecture>
</xsl:template>
	
<xsl:template name="address">
	<xsl:param name="node" select="." />
	
	<xsl:variable name="index">
		<xsl:value-of select="count($node/preceding-sibling::*)"></xsl:value-of>
	</xsl:variable>
	<xsl:choose>
		<xsl:when test="$index > 0">
			<xsl:variable name="previous">
				<xsl:call-template name="address">
					<xsl:with-param name="node" select="$node/preceding-sibling::*[1]"/>
				</xsl:call-template>
			</xsl:variable>
			<xsl:variable name="prev_size">
				<xsl:call-template name="size">
					<xsl:with-param name="node" select="$node/preceding-sibling::*[1]"/>
				</xsl:call-template>
			</xsl:variable>
			<xsl:value-of select="$previous + ($prev_size div 8)"></xsl:value-of>
		</xsl:when>
		<xsl:otherwise>
			<xsl:variable name="baseAddrText"><xsl:value-of select="$node/../@edc:beginaddr"/></xsl:variable>  
			<xsl:variable name="baseAddr">
				<xsl:choose>
					<xsl:when test="starts-with($baseAddrText,'0x')">
						<xsl:call-template name="hex2dec">
       						<xsl:with-param name="num" select="substring($baseAddrText,3)" />
    					</xsl:call-template>
					</xsl:when>
					<xsl:otherwise><xsl:value-of select="$baseAddrText"></xsl:value-of></xsl:otherwise>
				</xsl:choose>
			</xsl:variable>
			<xsl:value-of select="$baseAddr"/>
		</xsl:otherwise>
	</xsl:choose>
</xsl:template>	
	
<xsl:template name="size">
	<xsl:param name="node" select="." />
	<xsl:choose>
		<xsl:when test="name($node) = 'edc:Mirror'"><xsl:value-of select="$node/@edc:nzsize * 8"/></xsl:when>
		<xsl:when test="name($node) = 'edc:AdjustPoint'"><xsl:value-of select="$node/@edc:offset * 8"/></xsl:when>
		<xsl:when test="starts-with($node/@edc:nzwidth,'0x')">
			<xsl:call-template name="hex2dec">
       			<xsl:with-param name="num" select="substring($node/@edc:nzwidth,3)" />
    		</xsl:call-template>
		</xsl:when>
		<xsl:otherwise><xsl:value-of select="$node/@edc:nzwidth"/></xsl:otherwise>
	</xsl:choose>	
</xsl:template>	
	
<xsl:template name="hex2dec">
    <xsl:param name="num" />
    <xsl:param name="hex" select="translate($num,'abcdef','ABCDEF')"/>
    <xsl:param name="acc" select="0" />
    <xsl:choose>
        <xsl:when test="string-length($hex)">
            <xsl:call-template name="hex2dec">
            	<xsl:with-param name="num" select="$num"/>
                <xsl:with-param name="hex" select="substring($hex,2,string-length($hex))" />
                <xsl:with-param name="acc" select="$acc * 16 + string-length(substring-before('0123456789ABCDEF',substring($hex,1,1)))" />
            </xsl:call-template>
        </xsl:when>
        <xsl:otherwise>
            <xsl:value-of select="$acc" />
        </xsl:otherwise>
    </xsl:choose>
</xsl:template>	
	
  <xsl:template name="ConvertDecToHex">
    <xsl:param name="index" />
    <xsl:if test="$index > 0">
      <xsl:call-template name="ConvertDecToHex">
        <xsl:with-param name="index" select="floor($index div 16)" />
      </xsl:call-template>
      <xsl:choose>
        <xsl:when test="$index mod 16 &lt; 10">
          <xsl:value-of select="$index mod 16" />
        </xsl:when>
        <xsl:otherwise>
          <xsl:choose>
            <xsl:when test="$index mod 16 = 10">A</xsl:when>
            <xsl:when test="$index mod 16 = 11">B</xsl:when>
            <xsl:when test="$index mod 16 = 12">C</xsl:when>
            <xsl:when test="$index mod 16 = 13">D</xsl:when>
            <xsl:when test="$index mod 16 = 14">E</xsl:when>
            <xsl:when test="$index mod 16 = 15">F</xsl:when>
            <xsl:otherwise>A</xsl:otherwise>
          </xsl:choose>
        </xsl:otherwise>
      </xsl:choose>
    </xsl:if>
  </xsl:template>	
	
</xsl:stylesheet>