<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" xmlns:str="http://exslt.org/strings" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
	<xsl:output method="html" indent="yes"></xsl:output>
	
	<xsl:template match="ecore:EPackage">
	<html><body>
		<h1>Model reference</h1>
		<xsl:call-template name="print_package" />
	</body></html>
	</xsl:template>
	
	<xsl:template name="print_package">
		<h2>Package <xsl:value-of select="@name"/></h2>
		<dl>
			<dt>Namespace URI</dt>
			<dd><xsl:value-of select="@nsURI"/></dd>
		</dl>
		<xsl:call-template name="print_doc" />
		
		<xsl:for-each select="eClassifiers">
			<xsl:call-template name="print_eclass" />
		</xsl:for-each>
		
		<xsl:for-each select="eSubpackages">
			<xsl:call-template name="print_package" />
		</xsl:for-each>
	</xsl:template>
	
	<xsl:template name="print_eclass">
		<h3>
			<xsl:attribute name="id"><xsl:value-of select="@name"/></xsl:attribute>
			EClass <xsl:value-of select="@name"/>
		</h3>
		<dl>
			<dt>Super types</dt>
			<xsl:for-each select="str:tokenize(@eSuperTypes,' ')">
				<xsl:variable name="eclassname"><xsl:value-of select="str:tokenize(.,'/')[last()]"/></xsl:variable>
				<dd><a>
					<xsl:attribute name="href">#<xsl:value-of select="$eclassname" /></xsl:attribute>
					<xsl:value-of select="$eclassname" />
				</a></dd>
			</xsl:for-each>
		</dl>
		<xsl:call-template name="print_doc" />
		
		<table border="1">
			<tr>
			<th>Feature</th>
			<th>Multiplicity</th>
			<th>Type</th>
			<th>Description</th>
			</tr>
			<xsl:for-each select="eStructuralFeatures">
				<tr>
				<xsl:call-template name="print_feature"></xsl:call-template>
				</tr>
			</xsl:for-each>
		</table>
		
	</xsl:template>
	
	<xsl:template name="print_feature">
		<xsl:variable name="lower">
			<xsl:choose>
				<xsl:when test="@lowerBound"><xsl:value-of select="@lowerBound"/></xsl:when>
				<xsl:otherwise>0</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<xsl:variable name="upper">
			<xsl:choose>
				<xsl:when test="@upperBound">
					<xsl:choose>
			 			<xsl:when test="@upperBound = '-1'">*</xsl:when>
			 			<xsl:otherwise><xsl:value-of select="@upperBound"/></xsl:otherwise>
			 		</xsl:choose>
				</xsl:when>
				<xsl:otherwise>1</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<xsl:variable name="etype"><xsl:value-of select="str:tokenize(@eType,'/')[last()]"/></xsl:variable>
		<td><xsl:value-of select="@name" /></td>
		<td>
			<xsl:value-of select="$lower" />..<xsl:value-of select="$upper" />
		</td>
		<td>
			<xsl:choose>
				<xsl:when test="@xsi:type = 'ecore:EReference'"> <!-- Reference -->
					<a>
						<xsl:attribute name="href">#<xsl:value-of select="$etype"/></xsl:attribute>
						<xsl:value-of select="$etype"/>
					</a>
				</xsl:when>
				<xsl:otherwise> <!-- Attribute -->
					<xsl:value-of select="$etype"></xsl:value-of>
				</xsl:otherwise>
			</xsl:choose>
		</td>
		<td>
			<xsl:call-template name="print_doc" />
		</td>
	</xsl:template>
	
	<xsl:template name="print_doc">
		<xsl:param name="node" select="." />
		<xsl:value-of select="eAnnotations[@source = 'http://www.eclipse.org/emf/2002/GenModel']/details[@key = 'documentation']/@value"></xsl:value-of>
	</xsl:template>
	
</xsl:stylesheet>