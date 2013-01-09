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
<xsl:apply-templates select="edc:DataSpace/edc:RegardlessOfMode/edc:SFRDataSector"/>
}
	</xsl:template>
	
<xsl:template match="edc:SFRDataSector"><xsl:apply-templates/></xsl:template>

<xsl:template match="edc:SFRDef">
<xsl:apply-templates/>
/*
 * <xsl:value-of select="@edc:name" />
 * <xsl:value-of select="@edc:desc" />
 */
register uint8 <xsl:value-of select="@edc:cname" />;
</xsl:template>
	
</xsl:stylesheet>