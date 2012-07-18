<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
		<title>MODembed Help</title>
		
		<link rel="stylesheet" type="text/css" href="helpstyle.css" />
		
		<body><div class="main">
		
		<div class="toc">
		
		<h1>Table of contents</h1>
		<xsl:for-each select="toc">
		<h2>
			<!-- xsl:attribute name="href"><xsl:value-of select="@topic" /></xsl:attribute-->
			<xsl:value-of select="@label" />
		</h2><br/>
			<ul>
			<xsl:apply-templates></xsl:apply-templates>	
			</ul>
		</xsl:for-each>
		
		</div>
		
		<iframe id="page" name="page" src="contents/00-Main.html" frameborder="0"/>

		<div class="clear" />
		</div>
		</body></html>
	</xsl:template>
	
	<xsl:template match="topic">
		<li>
		<xsl:choose>
			<xsl:when test="@href !=''">
			<a target="page">
				<xsl:attribute name="href"><xsl:value-of select="@href" /></xsl:attribute>
				<xsl:value-of select="@label" />
			</a>
			</xsl:when>
			<xsl:otherwise>
				<span class="li"><xsl:value-of select="@label" /></span>
			</xsl:otherwise>
		</xsl:choose>
		<ul>
			<xsl:apply-templates></xsl:apply-templates>
		</ul>
		</li>
	</xsl:template>
</xsl:stylesheet>