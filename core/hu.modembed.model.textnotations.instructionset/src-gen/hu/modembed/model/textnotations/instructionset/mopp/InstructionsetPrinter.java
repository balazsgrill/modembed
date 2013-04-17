/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.mopp;

public class InstructionsetPrinter implements hu.modembed.model.textnotations.instructionset.IInstructionsetTextPrinter {
	
	protected hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolverFactory tokenResolverFactory = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource resource;
	
	private java.util.Map<?, ?> options;
	private String encoding = System.getProperty("file.encoding");
	
	public InstructionsetPrinter(java.io.OutputStream outputStream, hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource resource) {
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
		
		if (element instanceof hu.modembed.model.modembed.core.instructionset.InstructionSet) {
			print_hu_modembed_model_modembed_core_instructionset_InstructionSet((hu.modembed.model.modembed.core.instructionset.InstructionSet) element, globaltab, out);
			return;
		}
		if (element instanceof hu.modembed.model.modembed.core.instructionset.Instruction) {
			print_hu_modembed_model_modembed_core_instructionset_Instruction((hu.modembed.model.modembed.core.instructionset.Instruction) element, globaltab, out);
			return;
		}
		if (element instanceof hu.modembed.model.modembed.core.instructionset.InstructionParameter) {
			print_hu_modembed_model_modembed_core_instructionset_InstructionParameter((hu.modembed.model.modembed.core.instructionset.InstructionParameter) element, globaltab, out);
			return;
		}
		if (element instanceof hu.modembed.model.modembed.core.instructionset.InstructionWord) {
			print_hu_modembed_model_modembed_core_instructionset_InstructionWord((hu.modembed.model.modembed.core.instructionset.InstructionWord) element, globaltab, out);
			return;
		}
		if (element instanceof hu.modembed.model.modembed.core.instructionset.ConstantSection) {
			print_hu_modembed_model_modembed_core_instructionset_ConstantSection((hu.modembed.model.modembed.core.instructionset.ConstantSection) element, globaltab, out);
			return;
		}
		if (element instanceof hu.modembed.model.modembed.core.instructionset.ParameterSection) {
			print_hu_modembed_model_modembed_core_instructionset_ParameterSection((hu.modembed.model.modembed.core.instructionset.ParameterSection) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected hu.modembed.model.textnotations.instructionset.mopp.InstructionsetReferenceResolverSwitch getReferenceResolverSwitch() {
		return (hu.modembed.model.textnotations.instructionset.mopp.InstructionsetReferenceResolverSwitch) new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetProblem(errorMessage, hu.modembed.model.textnotations.instructionset.InstructionsetEProblemType.PRINT_PROBLEM, hu.modembed.model.textnotations.instructionset.InstructionsetEProblemSeverity.WARNING), cause);
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
	
	public hu.modembed.model.textnotations.instructionset.IInstructionsetTextResource getResource() {
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
	
	public void print_hu_modembed_model_modembed_core_instructionset_InstructionSet(hu.modembed.model.modembed.core.instructionset.InstructionSet element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_SET__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_SET__ORIGINS));
		printCountingMap.put("origins", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_SET__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_SET__INSTRUCTIONS));
		printCountingMap.put("instructions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_SET__EXTEND));
		printCountingMap.put("extend", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("instructionset");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_SET__NAME));
			if (o != null) {
				hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_SET__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_hu_modembed_model_modembed_core_instructionset_InstructionSet_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_hu_modembed_model_modembed_core_instructionset_InstructionSet_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_hu_modembed_model_modembed_core_instructionset_InstructionSet_0(hu.modembed.model.modembed.core.instructionset.InstructionSet element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("extends");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("extend");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_SET__EXTEND));
			if (o != null) {
				hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInstructionSetExtendReferenceResolver().deResolve((hu.modembed.model.modembed.core.instructionset.InstructionSet) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_SET__EXTEND)), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_SET__EXTEND), element));
				out.print(" ");
			}
			printCountingMap.put("extend", count - 1);
		}
	}
	
	public void print_hu_modembed_model_modembed_core_instructionset_InstructionSet_1(hu.modembed.model.modembed.core.instructionset.InstructionSet element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("instructions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_SET__INSTRUCTIONS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("instructions", count - 1);
		}
	}
	
	
	public void print_hu_modembed_model_modembed_core_instructionset_Instruction(hu.modembed.model.modembed.core.instructionset.Instruction element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION__ORIGINS));
		printCountingMap.put("origins", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION__PARAMETERS));
		printCountingMap.put("parameters", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION__WORDS));
		printCountingMap.put("words", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION__NAME));
			if (o != null) {
				hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_hu_modembed_model_modembed_core_instructionset_Instruction_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_hu_modembed_model_modembed_core_instructionset_Instruction_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_hu_modembed_model_modembed_core_instructionset_Instruction_0(hu.modembed.model.modembed.core.instructionset.Instruction element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
	}
	
	public void print_hu_modembed_model_modembed_core_instructionset_Instruction_1(hu.modembed.model.modembed.core.instructionset.Instruction element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("words");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION__WORDS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("words", count - 1);
		}
	}
	
	
	public void print_hu_modembed_model_modembed_core_instructionset_InstructionParameter(hu.modembed.model.modembed.core.instructionset.InstructionParameter element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_PARAMETER__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_PARAMETER__ORIGINS));
		printCountingMap.put("origins", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_PARAMETER__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_PARAMETER__DEFAULT_VALUE));
		printCountingMap.put("defaultValue", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_PARAMETER__NAME));
			if (o != null) {
				hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_PARAMETER__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_hu_modembed_model_modembed_core_instructionset_InstructionParameter_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_hu_modembed_model_modembed_core_instructionset_InstructionParameter_0(hu.modembed.model.modembed.core.instructionset.InstructionParameter element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("defaultValue");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_PARAMETER__DEFAULT_VALUE));
			if (o != null) {
				hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver resolver = tokenResolverFactory.createTokenResolver("INT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_PARAMETER__DEFAULT_VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("defaultValue", count - 1);
		}
	}
	
	
	public void print_hu_modembed_model_modembed_core_instructionset_InstructionWord(hu.modembed.model.modembed.core.instructionset.InstructionWord element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_WORD__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_WORD__ORIGINS));
		printCountingMap.put("origins", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_WORD__SECTIONS));
		printCountingMap.put("sections", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_WORD__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("<");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sections");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_WORD__SECTIONS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("sections", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_hu_modembed_model_modembed_core_instructionset_InstructionWord_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(">");
		out.print(" ");
	}
	
	public void print_hu_modembed_model_modembed_core_instructionset_InstructionWord_0(hu.modembed.model.modembed.core.instructionset.InstructionWord element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("|");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sections");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.INSTRUCTION_WORD__SECTIONS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("sections", count - 1);
		}
	}
	
	
	public void print_hu_modembed_model_modembed_core_instructionset_ConstantSection(hu.modembed.model.modembed.core.instructionset.ConstantSection element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.CONSTANT_SECTION__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.CONSTANT_SECTION__ORIGINS));
		printCountingMap.put("origins", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.CONSTANT_SECTION__SIZE));
		printCountingMap.put("size", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.CONSTANT_SECTION__SHIFT));
		printCountingMap.put("shift", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.CONSTANT_SECTION__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.CONSTANT_SECTION__VALUE));
			if (o != null) {
				hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver resolver = tokenResolverFactory.createTokenResolver("BINARY");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.CONSTANT_SECTION__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("size");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.CONSTANT_SECTION__SIZE));
			if (o != null) {
				hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver resolver = tokenResolverFactory.createTokenResolver("INT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.CONSTANT_SECTION__SIZE), element));
				out.print(" ");
			}
			printCountingMap.put("size", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_hu_modembed_model_modembed_core_instructionset_ConstantSection_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_hu_modembed_model_modembed_core_instructionset_ConstantSection_0(hu.modembed.model.modembed.core.instructionset.ConstantSection element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("shift");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.CONSTANT_SECTION__SHIFT));
			if (o != null) {
				hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver resolver = tokenResolverFactory.createTokenResolver("INT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.CONSTANT_SECTION__SHIFT), element));
				out.print(" ");
			}
			printCountingMap.put("shift", count - 1);
		}
	}
	
	
	public void print_hu_modembed_model_modembed_core_instructionset_ParameterSection(hu.modembed.model.modembed.core.instructionset.ParameterSection element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.PARAMETER_SECTION__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.PARAMETER_SECTION__ORIGINS));
		printCountingMap.put("origins", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.PARAMETER_SECTION__SIZE));
		printCountingMap.put("size", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.PARAMETER_SECTION__SHIFT));
		printCountingMap.put("shift", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.PARAMETER_SECTION__PARAMETER));
		printCountingMap.put("parameter", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("parameter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.PARAMETER_SECTION__PARAMETER));
			if (o != null) {
				hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getParameterSectionParameterReferenceResolver().deResolve((hu.modembed.model.modembed.core.instructionset.InstructionParameter) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.PARAMETER_SECTION__PARAMETER)), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.PARAMETER_SECTION__PARAMETER), element));
				out.print(" ");
			}
			printCountingMap.put("parameter", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("size");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.PARAMETER_SECTION__SIZE));
			if (o != null) {
				hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver resolver = tokenResolverFactory.createTokenResolver("INT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.PARAMETER_SECTION__SIZE), element));
				out.print(" ");
			}
			printCountingMap.put("size", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_hu_modembed_model_modembed_core_instructionset_ParameterSection_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_hu_modembed_model_modembed_core_instructionset_ParameterSection_0(hu.modembed.model.modembed.core.instructionset.ParameterSection element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("shift");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.PARAMETER_SECTION__SHIFT));
			if (o != null) {
				hu.modembed.model.textnotations.instructionset.IInstructionsetTokenResolver resolver = tokenResolverFactory.createTokenResolver("INT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hu.modembed.model.modembed.core.instructionset.InstructionsetPackage.PARAMETER_SECTION__SHIFT), element));
				out.print(" ");
			}
			printCountingMap.put("shift", count - 1);
		}
	}
	
	
}
