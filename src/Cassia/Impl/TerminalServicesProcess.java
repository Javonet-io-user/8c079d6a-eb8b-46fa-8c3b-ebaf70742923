package Cassia.Impl;

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
import Cassia.Impl.*;
import Cassia.*;
import jio.System.Security.Principal.*;
import jio.System.Diagnostics.*;

public class TerminalServicesProcess implements ITerminalServicesProcess {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public ITerminalServer getServer() {
    try {
      Object res =
          javonetHandle.explicitInterface("Cassia.ITerminalServicesProcess").invoke("get_Server");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getSessionId() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("Cassia.ITerminalServicesProcess")
              .invoke("get_SessionId");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getProcessId() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("Cassia.ITerminalServicesProcess")
              .invoke("get_ProcessId");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getProcessName() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Cassia.ITerminalServicesProcess")
              .invoke("get_ProcessName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SecurityIdentifier getSecurityIdentifier() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Cassia.ITerminalServicesProcess")
              .invoke("get_SecurityIdentifier");
      if (res == null) return null;
      return new SecurityIdentifier((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Diagnostics.Process getUnderlyingProcess() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Cassia.ITerminalServicesProcess")
              .invoke("get_UnderlyingProcess");
      if (res == null) return null;
      return new jio.System.Diagnostics.Process((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public TerminalServicesProcess(ITerminalServer server, WTS_PROCESS_INFO processInfo) {
    try {
      javonetHandle = Javonet.New("Cassia.Impl.TerminalServicesProcess", server, processInfo);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TerminalServicesProcess(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Kill() {
    try {
      javonetHandle.explicitInterface("Cassia.ITerminalServicesProcess").invoke("Kill");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Kill(java.lang.Integer exitCode) {
    try {
      javonetHandle.explicitInterface("Cassia.ITerminalServicesProcess").invoke("Kill", exitCode);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
