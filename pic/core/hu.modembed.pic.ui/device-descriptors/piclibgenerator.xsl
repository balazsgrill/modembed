<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:edc="http://crownking/edc">
<xsl:output method="text" encoding="utf-8" indent="no" />
	
<xsl:template match="edc:PIC">/*
 * Library for <xsl:value-of select="@edc:name" />.
 * <xsl:value-of select="@edc:desc" />
 * Architecture: <xsl:value-of select="@edc:arch" />
 */
library microchip.<xsl:value-of select="@edc:name" />{
use e.platform;
<xsl:for-each select="edc:DataSpace/edc:RegardlessOfMode/edc:SFRDataSector">
/**************************************
 * SFR Data sector <xsl:value-of select="@edc:regionid"/>
 * Bank: <xsl:value-of select="@edc:bank"/>
 **************************************/
	<xsl:for-each select="*">
		<xsl:variable name="size">
			<xsl:call-template name="size" />
    	</xsl:variable>
    	<xsl:variable name="address">
    		<xsl:call-template name="address"/>
    	</xsl:variable>
    	<xsl:variable name="hexAddress">
    		<xsl:choose>
    			<xsl:when test="$address = 0">0</xsl:when>
    			<xsl:otherwise>
    				<xsl:call-template name="ConvertDecToHex">
   						<xsl:with-param name="index" select="$address"/>
					</xsl:call-template>
    			</xsl:otherwise>
    		</xsl:choose>
    	</xsl:variable>

<xsl:choose>
	<xsl:when test="name(.) = 'edc:AdjustPoint'">
/* Adjustpoint - <xsl:value-of select="$size"/> bits */
	</xsl:when>
	<xsl:when test="name(.) = 'edc:SFRDef'">
/*
 * <xsl:value-of select="@edc:name" />
 * <xsl:value-of select="@edc:desc" />
 * Size: <xsl:value-of select="$size"/> bits
 */
register uint<xsl:value-of select="$size"/><xsl:text> </xsl:text><xsl:value-of select="@edc:cname" /> : 0x<xsl:value-of select="$hexAddress"/>;
	</xsl:when>
	<xsl:when test="name(.) = 'edc:JoinedSFRDef'">
/*
 * <xsl:value-of select="@edc:name" />
 * <xsl:value-of select="@edc:desc" />
 * Size: <xsl:value-of select="$size"/> bits
 */
register uint<xsl:value-of select="$size"/><xsl:text> </xsl:text><xsl:value-of select="@edc:cname" /> : 0x<xsl:value-of select="$hexAddress"/>;
	</xsl:when>
</xsl:choose>

	</xsl:for-each>
</xsl:for-each>
}
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