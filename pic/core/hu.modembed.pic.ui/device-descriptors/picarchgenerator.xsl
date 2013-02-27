<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
	xmlns:edc="http://crownking/edc" xmlns:architecture="http://modembed.hu/architecture" xmlns:pic="http://hu.modembed/pic">
<xsl:output method="xml" encoding="utf-8" indent="yes" />
	
<xsl:template match="edc:PIC">
	<pic:PICArchitecture xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:architecture="http://modembed.hu/architecture"  xmlns:pic="http://hu.modembed/pic">
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
		
		<xsl:variable name="configStart">
			<xsl:call-template name="hex2dec">
				<xsl:with-param name="num" select="substring(edc:ProgramSpace/edc:ConfigFuseSector/@edc:beginaddr, 3)"></xsl:with-param>
			</xsl:call-template>
		</xsl:variable>
		<xsl:for-each select="edc:ProgramSpace/edc:ConfigFuseSector/edc:DCRDef">
		<configWords>
			<xsl:attribute name="name"><xsl:value-of select="@edc:cname"/></xsl:attribute>
			<xsl:attribute name="description"><xsl:value-of select="@edc:desc"/></xsl:attribute>
			<xsl:attribute name="address">
				<xsl:call-template name="address">
					<xsl:with-param name="beginAddr" select="$configStart"></xsl:with-param>
					<xsl:with-param name="wordsize" select="16"></xsl:with-param>
				</xsl:call-template>
			</xsl:attribute>
			<xsl:attribute name="size">
				<xsl:call-template name="size"></xsl:call-template>
			</xsl:attribute>
			<xsl:attribute name="defaultValue">
				<xsl:choose>
					<xsl:when test="starts-with(@edc:default, '0x')">
						<xsl:call-template name="hex2dec">
							<xsl:with-param name="num" select="substring(@edc:default,3)"></xsl:with-param>
						</xsl:call-template>
					</xsl:when>
					<xsl:otherwise><xsl:value-of select="@edc:default"/></xsl:otherwise>
				</xsl:choose>
			</xsl:attribute>
			<xsl:for-each select="edc:DCRModeList/edc:DCRMode/edc:DCRFieldDef">
			<fields>
				<xsl:attribute name="name"><xsl:value-of select="@edc:cname"/></xsl:attribute>
				<xsl:attribute name="description"><xsl:value-of select="@edc:desc"/></xsl:attribute>
				<xsl:attribute name="start">
					<xsl:call-template name="address">
						<xsl:with-param name="beginAddr" select="0"></xsl:with-param>
						<xsl:with-param name="wordsize" select="1"></xsl:with-param>
					</xsl:call-template>
				</xsl:attribute>
				<xsl:attribute name="size">
					<xsl:choose>
						<xsl:when test="starts-with(@edc:nzwidth, '0x')">
							<xsl:call-template name="hex2dec">
								<xsl:with-param name="num" select="substring(@edc:nzwidth,3)"></xsl:with-param>
							</xsl:call-template>
						</xsl:when>
						<xsl:otherwise><xsl:value-of select="@edc:nzwidth"/></xsl:otherwise>
					</xsl:choose>
				</xsl:attribute>
				<xsl:for-each select="edc:DCRFieldSemantic">
				<literals>
					<xsl:attribute name="name"><xsl:value-of select="@edc:cname"/></xsl:attribute>
					<xsl:attribute name="description"><xsl:value-of select="@edc:desc"/></xsl:attribute>
					<xsl:variable name="valueText">
						<xsl:value-of select="substring-after(@edc:when,'== ')"></xsl:value-of>
					</xsl:variable>
					<xsl:attribute name="value">
						<xsl:choose>
						<xsl:when test="starts-with($valueText, '0x')">
							<xsl:call-template name="hex2dec">
								<xsl:with-param name="num" select="substring($valueText,3)"></xsl:with-param>
							</xsl:call-template>
						</xsl:when>
						<xsl:otherwise><xsl:value-of select="$valueText"/></xsl:otherwise>
					</xsl:choose>
					</xsl:attribute>
				</literals>
				</xsl:for-each>
			</fields>
			</xsl:for-each>
		</configWords>
		</xsl:for-each>
		
	</pic:PICArchitecture>
</xsl:template>
	
<xsl:template name="address">
	<xsl:param name="node" select="." />
	<xsl:param name="beginAddr" />
	<xsl:param name="wordsize" select="8" />
	
	<xsl:variable name="index">
		<xsl:value-of select="count($node/preceding-sibling::*)"></xsl:value-of>
	</xsl:variable>
	<xsl:choose>
		<xsl:when test="$index > 0">
			<xsl:variable name="previous">
				<xsl:call-template name="address">
					<xsl:with-param name="node" select="$node/preceding-sibling::*[1]"/>
					<xsl:with-param name="beginAddr" select="$beginAddr"/>
					<xsl:with-param name="wordsize" select="$wordsize"/>
				</xsl:call-template>
			</xsl:variable>
			<xsl:variable name="prev_size">
				<xsl:call-template name="size">
					<xsl:with-param name="node" select="$node/preceding-sibling::*[1]"/>
					<xsl:with-param name="wordsize" select="$wordsize"/>
				</xsl:call-template>
			</xsl:variable>
			<xsl:value-of select="$previous + ($prev_size div $wordsize)"/>
		</xsl:when>
		<xsl:otherwise>
			<xsl:value-of select="$beginAddr"/>
		</xsl:otherwise>
	</xsl:choose>
</xsl:template>	
	
<xsl:template name="size">
	<xsl:param name="node" select="." />
	<xsl:param name="wordsize" select="8"/>
	<xsl:choose>
		<xsl:when test="name($node) = 'edc:Mirror'"><xsl:value-of select="$node/@edc:nzsize * $wordsize"/></xsl:when>
		<xsl:when test="name($node) = 'edc:AdjustPoint'"><xsl:value-of select="$node/@edc:offset * $wordsize"/></xsl:when>
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