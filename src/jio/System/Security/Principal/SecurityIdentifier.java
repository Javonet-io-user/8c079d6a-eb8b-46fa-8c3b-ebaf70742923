package jio.System.Security.Principal;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import jio.System.Security.Principal.*;
import jio.System.*;

public class SecurityIdentifier extends IdentityReference
    implements IComparableT<SecurityIdentifier> {
  protected NObject javonetHandle;

  public SecurityIdentifier(java.lang.String sddlForm) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Security.Principal.SecurityIdentifier", sddlForm);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SecurityIdentifier(WellKnownSidType sidType, SecurityIdentifier domainSid) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Principal.SecurityIdentifier",
              NEnum.fromJavaEnum(sidType),
              domainSid);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SecurityIdentifier(java.lang.Byte[] binaryForm, java.lang.Integer offset) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Security.Principal.SecurityIdentifier", new Object[] {binaryForm}, offset);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SecurityIdentifier(IntPtr binaryForm) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Security.Principal.SecurityIdentifier", binaryForm);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SecurityIdentifier(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
