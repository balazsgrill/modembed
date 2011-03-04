<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
		<title>MODembed Help</title>
		<body>
		<h1>Table of contents</h1>
		<xsl:for-each select="toc">
		<a>
			<xsl:attribute name="href"><xsl:value-of select="@topic" /></xsl:attribute>
			<xsl:value-of select="@label" />
		</a><br/>
			<ul>
			<xsl:for-each select="topic">
				<li><a>
					<xsl:attribute name="href"><xsl:value-of select="@href" /></xsl:attribute>
					<xsl:value-of select="@label" />
				</a></li>
			</xsl:for-each>
			</ul>
		</xsl:for-each>
		</body></html>
	</xsl:template>
</xsl:stylesheet>