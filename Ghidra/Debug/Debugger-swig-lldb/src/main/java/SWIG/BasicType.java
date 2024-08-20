/* ###
 * IP: Apache License 2.0 with LLVM Exceptions
 */
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package SWIG;

public final class BasicType {
  public final static BasicType eBasicTypeInvalid = new BasicType("eBasicTypeInvalid", lldbJNI.eBasicTypeInvalid_get());
  public final static BasicType eBasicTypeVoid = new BasicType("eBasicTypeVoid", lldbJNI.eBasicTypeVoid_get());
  public final static BasicType eBasicTypeChar = new BasicType("eBasicTypeChar");
  public final static BasicType eBasicTypeSignedChar = new BasicType("eBasicTypeSignedChar");
  public final static BasicType eBasicTypeUnsignedChar = new BasicType("eBasicTypeUnsignedChar");
  public final static BasicType eBasicTypeWChar = new BasicType("eBasicTypeWChar");
  public final static BasicType eBasicTypeSignedWChar = new BasicType("eBasicTypeSignedWChar");
  public final static BasicType eBasicTypeUnsignedWChar = new BasicType("eBasicTypeUnsignedWChar");
  public final static BasicType eBasicTypeChar16 = new BasicType("eBasicTypeChar16");
  public final static BasicType eBasicTypeChar32 = new BasicType("eBasicTypeChar32");
  public final static BasicType eBasicTypeChar8 = new BasicType("eBasicTypeChar8");
  public final static BasicType eBasicTypeShort = new BasicType("eBasicTypeShort");
  public final static BasicType eBasicTypeUnsignedShort = new BasicType("eBasicTypeUnsignedShort");
  public final static BasicType eBasicTypeInt = new BasicType("eBasicTypeInt");
  public final static BasicType eBasicTypeUnsignedInt = new BasicType("eBasicTypeUnsignedInt");
  public final static BasicType eBasicTypeLong = new BasicType("eBasicTypeLong");
  public final static BasicType eBasicTypeUnsignedLong = new BasicType("eBasicTypeUnsignedLong");
  public final static BasicType eBasicTypeLongLong = new BasicType("eBasicTypeLongLong");
  public final static BasicType eBasicTypeUnsignedLongLong = new BasicType("eBasicTypeUnsignedLongLong");
  public final static BasicType eBasicTypeInt128 = new BasicType("eBasicTypeInt128");
  public final static BasicType eBasicTypeUnsignedInt128 = new BasicType("eBasicTypeUnsignedInt128");
  public final static BasicType eBasicTypeBool = new BasicType("eBasicTypeBool");
  public final static BasicType eBasicTypeHalf = new BasicType("eBasicTypeHalf");
  public final static BasicType eBasicTypeFloat = new BasicType("eBasicTypeFloat");
  public final static BasicType eBasicTypeDouble = new BasicType("eBasicTypeDouble");
  public final static BasicType eBasicTypeLongDouble = new BasicType("eBasicTypeLongDouble");
  public final static BasicType eBasicTypeFloatComplex = new BasicType("eBasicTypeFloatComplex");
  public final static BasicType eBasicTypeDoubleComplex = new BasicType("eBasicTypeDoubleComplex");
  public final static BasicType eBasicTypeLongDoubleComplex = new BasicType("eBasicTypeLongDoubleComplex");
  public final static BasicType eBasicTypeObjCID = new BasicType("eBasicTypeObjCID");
  public final static BasicType eBasicTypeObjCClass = new BasicType("eBasicTypeObjCClass");
  public final static BasicType eBasicTypeObjCSel = new BasicType("eBasicTypeObjCSel");
  public final static BasicType eBasicTypeNullPtr = new BasicType("eBasicTypeNullPtr");
  public final static BasicType eBasicTypeOther = new BasicType("eBasicTypeOther");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static BasicType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + BasicType.class + " with value " + swigValue);
  }

  private BasicType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private BasicType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private BasicType(String swigName, BasicType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static BasicType[] swigValues = { eBasicTypeInvalid, eBasicTypeVoid, eBasicTypeChar, eBasicTypeSignedChar, eBasicTypeUnsignedChar, eBasicTypeWChar, eBasicTypeSignedWChar, eBasicTypeUnsignedWChar, eBasicTypeChar16, eBasicTypeChar32, eBasicTypeChar8, eBasicTypeShort, eBasicTypeUnsignedShort, eBasicTypeInt, eBasicTypeUnsignedInt, eBasicTypeLong, eBasicTypeUnsignedLong, eBasicTypeLongLong, eBasicTypeUnsignedLongLong, eBasicTypeInt128, eBasicTypeUnsignedInt128, eBasicTypeBool, eBasicTypeHalf, eBasicTypeFloat, eBasicTypeDouble, eBasicTypeLongDouble, eBasicTypeFloatComplex, eBasicTypeDoubleComplex, eBasicTypeLongDoubleComplex, eBasicTypeObjCID, eBasicTypeObjCClass, eBasicTypeObjCSel, eBasicTypeNullPtr, eBasicTypeOther };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

