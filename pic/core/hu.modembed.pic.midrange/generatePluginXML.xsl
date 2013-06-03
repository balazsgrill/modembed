<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:edc="http://crownking/edc">
<xsl:output method="xml" encoding="utf-8" indent="yes" />
	<xsl:template match="list">
		<plugin>
			<extension point="hu.modembed.ui.includedCode">
			<xsl:for-each select="file">
				<xsl:apply-templates select="document(.)"></xsl:apply-templates>
			</xsl:for-each>
			</extension>
		</plugin>
 	</xsl:template>
 	
 	<xsl:template match="edc:PIC">
 		<xsl:comment><xsl:value-of select="@edc:name" /></xsl:comment>
 		<project>
 			<xsl:attribute name="id">microchip.<xsl:value-of select="@edc:name"/></xsl:attribute>
 			<xsl:attribute name="name"><xsl:value-of select="@edc:name"/> device-specific libraries</xsl:attribute>
 			<xsl:attribute name="category">hu.modembed.pic.midrange.category</xsl:attribute>
 			<dependency project="e.core">
         	</dependency>
         	<dependency project="microchip.pic16">
         	</dependency>
         	<resource path="/">
         		<xsl:attribute name="resource">gen-lib/<xsl:value-of select="@edc:name"/>.config.xmi</xsl:attribute>
         	</resource>
         	<resource path="/">
         		<xsl:attribute name="resource">gen-lib/<xsl:value-of select="@edc:name"/>.module.m</xsl:attribute>
         	</resource>
         	<resource path="/">
         		<xsl:attribute name="resource">gen-lib/<xsl:value-of select="@edc:name"/>.device.m</xsl:attribute>
         	</resource>
 		</project>
 	</xsl:template>
 	
</xsl:stylesheet>