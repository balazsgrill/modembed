<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="xml" indent="yes"></xsl:output>
	<xsl:template match="/">

		<xsl:for-each select="toc">
		<toc>
			<xsl:attribute name="label"><xsl:value-of select="@label"></xsl:value-of></xsl:attribute>
			<xsl:attribute name="topic"><xsl:value-of select="@topic"></xsl:value-of></xsl:attribute>
			<xsl:apply-templates></xsl:apply-templates>
		</toc>
		</xsl:for-each>

	</xsl:template>
	
	<xsl:template match="topic">
		<topic>
			<xsl:attribute name="label"><xsl:value-of select="@label"></xsl:value-of></xsl:attribute>
			<xsl:attribute name="href"><xsl:value-of select="@href"></xsl:value-of></xsl:attribute>
			<xsl:apply-templates></xsl:apply-templates>
		</topic>
	</xsl:template>
	
	<xsl:template match="link">
		<xsl:copy-of select="document(@toc)/toc/topic"></xsl:copy-of>
	</xsl:template>
</xsl:stylesheet>