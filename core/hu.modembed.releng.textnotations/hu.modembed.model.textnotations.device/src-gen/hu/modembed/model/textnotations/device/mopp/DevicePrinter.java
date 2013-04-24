/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.mopp;

public class DevicePrinter implements hu.modembed.model.textnotations.device.IDeviceTextPrinter {
	
	protected hu.modembed.model.textnotations.device.IDeviceTokenResolverFactory tokenResolverFactory = new hu.modembed.model.textnotations.device.mopp.DeviceTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private hu.modembed.model.textnotations.device.IDeviceTextResource resource;
	
	private java.util.Map<?, ?> options;
	private String encoding = System.getProperty("file.encoding");
	
	public DevicePrinter(java.io.OutputStream outputStream, hu.modembed.model.textnotations.device.IDeviceTextResource resource) {
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
		
		if (element instanceof hu.modembed.model.modembed.abstraction.DeviceAbstraction) {
			print_hu_modembed_model_modembed_abstraction_DeviceAbstraction((hu.modembed.model.modembed.abstraction.DeviceAbstraction) element, globaltab, out);
			return;
		}
		if (element instanceof hu.modembed.model.modembed.abstraction.memorymodel.MemoryType) {
			print_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType((hu.modembed.model.modembed.abstraction.memorymodel.MemoryType) element, globaltab, out);
			return;
		}
		if (element instanceof hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance) {
			print_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance((hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance) element, globaltab, out);
			return;
		}
		if (element instanceof hu.modembed.model.modembed.infrastructure.AttributeContainerDefinition) {
			print_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition((hu.modembed.model.modembed.infrastructure.AttributeContainerDefinition) element, globaltab, out);
			return;
		}
		if (element instanceof hu.modembed.model.modembed.infrastructure.AttributeDefinition) {
			print_hu_modembed_model_modembed_infrastructure_AttributeDefinition((hu.modembed.model.modembed.infrastructure.AttributeDefinition) element, globaltab, out);
			return;
		}
		if (element instanceof hu.modembed.model.modembed.infrastructure.AttributeValueContainer) {
			print_hu_modembed_model_modembed_infrastructure_AttributeValueContainer((hu.modembed.model.modembed.infrastructure.AttributeValueContainer) element, globaltab, out);
			return;
		}
		if (element instanceof hu.modembed.model.modembed.infrastructure.AttributeValue) {
			print_hu_modembed_model_modembed_infrastructure_AttributeValue((hu.modembed.model.modembed.infrastructure.AttributeValue) element, globaltab, out);
			return;
		}
		if (element instanceof hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition) {
			print_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition((hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition) element, globaltab, out);
			return;
		}
		if (element instanceof hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument) {
			print_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument((hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument) element, globaltab, out);
			return;
		}
		if (element instanceof hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep) {
			print_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep((hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep) element, globaltab, out);
			return;
		}
		if (element instanceof hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping) {
			print_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping((hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping) element, globaltab, out);
			return;
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
	
	protected hu.modembed.model.textnotations.device.mopp.DeviceReferenceResolverSwitch getReferenceResolverSwitch() {
		return (hu.modembed.model.textnotations.device.mopp.DeviceReferenceResolverSwitch) new hu.modembed.model.textnotations.device.mopp.DeviceMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		hu.modembed.model.textnotations.device.IDeviceTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new hu.modembed.model.textnotations.device.mopp.DeviceProblem(errorMessage, hu.modembed.model.textnotations.device.DeviceEProblemType.PRINT_PROBLEM, hu.modembed.model.textnotations.device.DeviceEProblemSeverity.WARNING), cause);
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
	
	public hu.modembed.model.textnotations.device.IDeviceTextResource getResource() {
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
	
	public void print_hu_modembed_model_modembed_abstraction_DeviceAbstraction(hu.modembed.model.modembed.abstraction.DeviceAbstraction element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__ORIGINS));
		printCountingMap.put("origins", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__ANCESTOR));
		printCountingMap.put("ancestor", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__INSTRUCTIONSET));
		printCountingMap.put("instructionset", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_TYPES));
		printCountingMap.put("memoryTypes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_INSTANCES));
		printCountingMap.put("memoryInstances", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("device");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__NAME));
			if (o != null) {
				hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_hu_modembed_model_modembed_abstraction_DeviceAbstraction_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_hu_modembed_model_modembed_abstraction_DeviceAbstraction_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_hu_modembed_model_modembed_abstraction_DeviceAbstraction_2(element, localtab, out1, printCountingMap1);
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
	
	public void print_hu_modembed_model_modembed_abstraction_DeviceAbstraction_0(hu.modembed.model.modembed.abstraction.DeviceAbstraction element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("extends");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("ancestor");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__ANCESTOR));
			if (o != null) {
				hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDeviceAbstractionAncestorReferenceResolver().deResolve((hu.modembed.model.modembed.abstraction.DeviceAbstraction) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__ANCESTOR)), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__ANCESTOR), element));
				out.print(" ");
			}
			printCountingMap.put("ancestor", count - 1);
		}
	}
	
	public void print_hu_modembed_model_modembed_abstraction_DeviceAbstraction_1(hu.modembed.model.modembed.abstraction.DeviceAbstraction element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("instructionset");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("instructionset");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__INSTRUCTIONSET));
			if (o != null) {
				hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getDeviceAbstractionInstructionsetReferenceResolver().deResolve((hu.modembed.model.modembed.core.instructionset.InstructionSet) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__INSTRUCTIONSET)), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__INSTRUCTIONSET), element));
				out.print(" ");
			}
			printCountingMap.put("instructionset", count - 1);
		}
	}
	
	public void print_hu_modembed_model_modembed_abstraction_DeviceAbstraction_2(hu.modembed.model.modembed.abstraction.DeviceAbstraction element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_hu_modembed_model_modembed_abstraction_DeviceAbstraction_2_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_hu_modembed_model_modembed_abstraction_DeviceAbstraction_2_0(hu.modembed.model.modembed.abstraction.DeviceAbstraction element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"memoryTypes"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"memoryInstances"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operation"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("memoryInstances");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_INSTANCES));
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
					printCountingMap.put("memoryInstances", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("operation");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__OPERATION));
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
					printCountingMap.put("operation", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("memoryTypes");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_TYPES));
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
				printCountingMap.put("memoryTypes", count - 1);
			}
		}
	}
	
	
	public void print_hu_modembed_model_modembed_abstraction_memorymodel_MemoryType(hu.modembed.model.modembed.abstraction.memorymodel.MemoryType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__ORIGINS));
		printCountingMap.put("origins", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__ATTRIBUTES));
		printCountingMap.put("attributes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__ACCESS_COST));
		printCountingMap.put("accessCost", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__CONTENT_VOLATILE));
		printCountingMap.put("contentVolatile", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_DATA));
		printCountingMap.put("forData", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_PROGRAM));
		printCountingMap.put("forProgram", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("mtype");
		out.print(" ");
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("contentVolatile");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__CONTENT_VOLATILE));
			if (o != null) {
			}
			printCountingMap.put("contentVolatile", count - 1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("forData");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_DATA));
			if (o != null) {
			}
			printCountingMap.put("forData", count - 1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("forProgram");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__FOR_PROGRAM));
			if (o != null) {
			}
			printCountingMap.put("forProgram", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__NAME));
			if (o != null) {
				hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("accessCost");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__ACCESS_COST));
			if (o != null) {
				hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver = tokenResolverFactory.createTokenResolver("INT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__ACCESS_COST), element));
				out.print(" ");
			}
			printCountingMap.put("accessCost", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("attributes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_TYPE__ATTRIBUTES));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("attributes", count - 1);
		}
	}
	
	
	public void print_hu_modembed_model_modembed_abstraction_memorymodel_MemoryInstance(hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__ORIGINS));
		printCountingMap.put("origins", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__START_ADDRESS));
		printCountingMap.put("startAddress", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__SIZE));
		printCountingMap.put("size", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__ATTRIBUTES));
		printCountingMap.put("attributes", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("minstance");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__NAME));
			if (o != null) {
				hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("[");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("startAddress");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__START_ADDRESS));
			if (o != null) {
				hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver = tokenResolverFactory.createTokenResolver("INT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__START_ADDRESS), element));
				out.print(" ");
			}
			printCountingMap.put("startAddress", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("size");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__SIZE));
			if (o != null) {
				hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver = tokenResolverFactory.createTokenResolver("INT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__SIZE), element));
				out.print(" ");
			}
			printCountingMap.put("size", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("]");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__TYPE));
			if (o != null) {
				hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMemoryInstanceTypeReferenceResolver().deResolve((hu.modembed.model.modembed.abstraction.memorymodel.MemoryType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__TYPE)), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("attributes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage.MEMORY_INSTANCE__ATTRIBUTES));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("attributes", count - 1);
		}
	}
	
	
	public void print_hu_modembed_model_modembed_infrastructure_AttributeContainerDefinition(hu.modembed.model.modembed.infrastructure.AttributeContainerDefinition element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_CONTAINER_DEFINITION__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_CONTAINER_DEFINITION__ORIGINS));
		printCountingMap.put("origins", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_CONTAINER_DEFINITION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_CONTAINER_DEFINITION__ATTRIBUTES));
		printCountingMap.put("attributes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("attributes");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_CONTAINER_DEFINITION__ATTRIBUTES));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("attributes", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	
	public void print_hu_modembed_model_modembed_infrastructure_AttributeDefinition(hu.modembed.model.modembed.infrastructure.AttributeDefinition element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_DEFINITION__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_DEFINITION__ORIGINS));
		printCountingMap.put("origins", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_DEFINITION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_DEFINITION__NAME));
			if (o != null) {
				hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_DEFINITION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	
	public void print_hu_modembed_model_modembed_infrastructure_AttributeValueContainer(hu.modembed.model.modembed.infrastructure.AttributeValueContainer element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_VALUE_CONTAINER__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_VALUE_CONTAINER__ORIGINS));
		printCountingMap.put("origins", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_VALUE_CONTAINER__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_VALUE_CONTAINER__DEFINITION));
		printCountingMap.put("definition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_VALUE_CONTAINER__VALUES));
		printCountingMap.put("values", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("values");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_VALUE_CONTAINER__VALUES));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("values", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	
	public void print_hu_modembed_model_modembed_infrastructure_AttributeValue(hu.modembed.model.modembed.infrastructure.AttributeValue element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_VALUE__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_VALUE__ORIGINS));
		printCountingMap.put("origins", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_VALUE__DEFINITION));
		printCountingMap.put("definition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_VALUE__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("definition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_VALUE__DEFINITION));
			if (o != null) {
				hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAttributeValueDefinitionReferenceResolver().deResolve((hu.modembed.model.modembed.infrastructure.AttributeDefinition) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_VALUE__DEFINITION)), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_VALUE__DEFINITION), element));
				out.print(" ");
			}
			printCountingMap.put("definition", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_VALUE__VALUE));
			if (o != null) {
				hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver = tokenResolverFactory.createTokenResolver("INT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hu.modembed.model.modembed.infrastructure.InfrastructurePackage.ATTRIBUTE_VALUE__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	
	public void print_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition(hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_DEFINITION__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_DEFINITION__ORIGINS));
		printCountingMap.put("origins", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_DEFINITION__ARGUMENTS));
		printCountingMap.put("arguments", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_DEFINITION__STEPS));
		printCountingMap.put("steps", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_DEFINITION__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("operation");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_DEFINITION__OPERATION));
			if (o != null) {
				hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_DEFINITION__OPERATION), element));
				out.print(" ");
			}
			printCountingMap.put("operation", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("steps");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_DEFINITION__STEPS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("steps", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition_0(hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_DEFINITION__ARGUMENTS));
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
			printCountingMap.put("arguments", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition_0_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_hu_modembed_model_modembed_abstraction_behavior_platform_OperationDefinition_0_0(hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_DEFINITION__ARGUMENTS));
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
			printCountingMap.put("arguments", count - 1);
		}
	}
	
	
	public void print_hu_modembed_model_modembed_abstraction_behavior_platform_OperationArgument(hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__ORIGINS));
		printCountingMap.put("origins", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__MEMTYPE));
		printCountingMap.put("memtype", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__INDIRECTION_LEVEL));
		printCountingMap.put("indirectionLevel", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("@");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("memtype");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__MEMTYPE));
			if (o != null) {
				hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOperationArgumentMemtypeReferenceResolver().deResolve((hu.modembed.model.modembed.abstraction.memorymodel.MemoryType) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__MEMTYPE)), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__MEMTYPE), element));
				out.print(" ");
			}
			printCountingMap.put("memtype", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("indirectionLevel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__INDIRECTION_LEVEL));
			if (o != null) {
				hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver = tokenResolverFactory.createTokenResolver("INT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__INDIRECTION_LEVEL), element));
				out.print(" ");
			}
			printCountingMap.put("indirectionLevel", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__NAME));
			if (o != null) {
				hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.OPERATION_ARGUMENT__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep(hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_CALL_OPERATION_STEP__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_CALL_OPERATION_STEP__ORIGINS));
		printCountingMap.put("origins", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_CALL_OPERATION_STEP__INSTRUCTION));
		printCountingMap.put("instruction", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_CALL_OPERATION_STEP__ARGUMENTS));
		printCountingMap.put("arguments", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("instruction");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_CALL_OPERATION_STEP__INSTRUCTION));
			if (o != null) {
				hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInstructionCallOperationStepInstructionReferenceResolver().deResolve((hu.modembed.model.modembed.core.instructionset.Instruction) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_CALL_OPERATION_STEP__INSTRUCTION)), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_CALL_OPERATION_STEP__INSTRUCTION), element));
				out.print(" ");
			}
			printCountingMap.put("instruction", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep_0(hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_CALL_OPERATION_STEP__ARGUMENTS));
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
			printCountingMap.put("arguments", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep_0_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionCallOperationStep_0_0(hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_CALL_OPERATION_STEP__ARGUMENTS));
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
			printCountingMap.put("arguments", count - 1);
		}
	}
	
	
	public void print_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping(hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__ORIGINS));
		printCountingMap.put("origins", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__BIT_OFFSET));
		printCountingMap.put("bitOffset", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__VALUE_OFFSET));
		printCountingMap.put("valueOffset", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__VALUE));
			if (o != null) {
				hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInstructionParameterMappingValueReferenceResolver().deResolve((hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__VALUE)), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping_0(hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("attribute");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__ATTRIBUTE));
			if (o != null) {
				hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getInstructionParameterMappingAttributeReferenceResolver().deResolve((hu.modembed.model.modembed.infrastructure.AttributeDefinition) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__ATTRIBUTE)), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__ATTRIBUTE), element));
				out.print(" ");
			}
			printCountingMap.put("attribute", count - 1);
		}
	}
	
	public void print_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping_1(hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("bitOffset");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__BIT_OFFSET));
			if (o != null) {
				hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver = tokenResolverFactory.createTokenResolver("INT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__BIT_OFFSET), element));
				out.print(" ");
			}
			printCountingMap.put("bitOffset", count - 1);
		}
	}
	
	public void print_hu_modembed_model_modembed_abstraction_behavior_platform_InstructionParameterMapping_2(hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("+");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("valueOffset");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__VALUE_OFFSET));
			if (o != null) {
				hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver = tokenResolverFactory.createTokenResolver("INT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__VALUE_OFFSET), element));
				out.print(" ");
			}
			printCountingMap.put("valueOffset", count - 1);
		}
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
				hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
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
				hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver = tokenResolverFactory.createTokenResolver("INT");
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
				hu.modembed.model.textnotations.device.IDeviceTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUALIFIEDID");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getReferenceTypeDefinitionTypeReferenceResolver().deResolve((hu.modembed.model.modembed.abstraction.types.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.REFERENCE_TYPE_DEFINITION__TYPE)), element.eClass().getEStructuralFeature(hu.modembed.model.modembed.abstraction.types.TypesPackage.REFERENCE_TYPE_DEFINITION__TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
}
