/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.mopp;

public class TypePrinter implements hu.modembed.model.textnotations.type.ITypeTextPrinter {
	
	protected hu.modembed.model.textnotations.type.ITypeTokenResolverFactory tokenResolverFactory = new hu.modembed.model.textnotations.type.mopp.TypeTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private hu.modembed.model.textnotations.type.ITypeTextResource resource;
	
	private java.util.Map<?, ?> options;
	private String encoding = System.getProperty("file.encoding");
	
	public TypePrinter(java.io.OutputStream outputStream, hu.modembed.model.textnotations.type.ITypeTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected int matchCount(java.util.Map<String, Integer> featureCounter, java.util.Collection<String> needed) {
		int pos = 0;
		int neg = 0;
		
		for (String featureName : featureCounter.keySet()) {
			if (needed.contains(featureName)) {
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.io.PrintWriter out, String globaltab) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof hu.modembed.model.modembed.abstraction.types.Type) {
			print_hu_modembed_model_modembed_abstraction_types_Type((hu.modembed.model.modembed.abstraction.types.Type) element, globaltab, out);
			return;
		}
		if (element instanceof hu.modembed.model.modembed.abstraction.types.UnsignedTypeDefinition) {
			print_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition((hu.modembed.model.modembed.abstraction.types.UnsignedTypeDefinition) element, globaltab, out);
			return;
		}
		if (element instanceof hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition) {
			print_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition((hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected hu.modembed.model.textnotations.type.mopp.TypeReferenceResolverSwitch getReferenceResolverSwitch() {
		return (hu.modembed.model.textnotations.type.mopp.TypeReferenceResolverSwitch) new hu.modembed.model.textnotations.type.mopp.TypeMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		hu.modembed.model.textnotations.type.ITypeTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new hu.modembed.model.textnotations.type.mopp.TypeProblem(errorMessage, hu.modembed.model.textnotations.type.TypeEProblemType.PRINT_PROBLEM, hu.modembed.model.textnotations.type.TypeEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public void setEncoding(String encoding) {
		if (encoding != null) {
			this.encoding = encoding;
		}
	}
	
	public String getEncoding() {
		return encoding;
	}
	
	public hu.modembed.model.textnotations.type.ITypeTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(org.eclipse.emf.ecore.EObject element) throws java.io.IOException {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.OutputStreamWriter(new java.io.BufferedOutputStream(outputStream), encoding));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_hu_modembed_model_modembed_abstraction_types_Type(hu.modembed.model.modembed.abstraction.types.Type element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.TYPE__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.TYPE__ORIGINS));
		printCountingMap.put("origins", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.TYPE__DEFINITION));
		printCountingMap.put("definition", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("type");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.TYPE__NAME));
			if (o != null) {
				hu.modembed.model.textnotations.type.ITypeTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("definition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.TYPE__DEFINITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("definition", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	
	public void print_hu_modembed_model_modembed_abstraction_types_UnsignedTypeDefinition(hu.modembed.model.modembed.abstraction.types.UnsignedTypeDefinition element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.UNSIGNED_TYPE_DEFINITION__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.UNSIGNED_TYPE_DEFINITION__ORIGINS));
		printCountingMap.put("origins", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.UNSIGNED_TYPE_DEFINITION__BITS));
		printCountingMap.put("bits", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("unsigned");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("bits");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.UNSIGNED_TYPE_DEFINITION__BITS));
			if (o != null) {
				hu.modembed.model.textnotations.type.ITypeTokenResolver resolver = tokenResolverFactory.createTokenResolver("INT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.UNSIGNED_TYPE_DEFINITION__BITS), element));
				out.print(" ");
			}
			printCountingMap.put("bits", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_hu_modembed_model_modembed_abstraction_types_ReferenceTypeDefinition(hu.modembed.model.modembed.abstraction.types.ReferenceTypeDefinition element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.REFERENCE_TYPE_DEFINITION__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.REFERENCE_TYPE_DEFINITION__ORIGINS));
		printCountingMap.put("origins", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.REFERENCE_TYPE_DEFINITION__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.REFERENCE_TYPE_DEFINITION__TYPE));
			if (o != null) {
				hu.modembed.model.textnotations.type.ITypeTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getReferenceTypeDefinitionTypeReferenceResolver().deResolve((hu.modembed.model.modembed.abstraction.types.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.REFERENCE_TYPE_DEFINITION__TYPE)), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.REFERENCE_TYPE_DEFINITION__TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
}
