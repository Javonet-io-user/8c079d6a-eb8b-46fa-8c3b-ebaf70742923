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
import jio.System.Collections.Generic.*;
import jio.System.*;

public class TerminalServer implements ITerminalServer, IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getServerName() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Cassia.ITerminalServer").invoke("get_ServerName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsOpen() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("Cassia.ITerminalServer").invoke("get_IsOpen");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ITerminalServerHandle getHandle() {
    try {
      Object res = javonetHandle.explicitInterface("Cassia.ITerminalServer").invoke("get_Handle");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public TerminalServer(ITerminalServerHandle handle) {
    try {
      javonetHandle = Javonet.New("Cassia.Impl.TerminalServer", handle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TerminalServer(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IList<ITerminalServicesSession> GetSessions() {
    try {
      Object res = javonetHandle.explicitInterface("Cassia.ITerminalServer").invoke("GetSessions");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ITerminalServicesSession GetSession(java.lang.Integer sessionId) {
    try {
      Object res =
          javonetHandle.explicitInterface("Cassia.ITerminalServer").invoke("GetSession", sessionId);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Open() {
    try {
      javonetHandle.explicitInterface("Cassia.ITerminalServer").invoke("Open");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Close() {
    try {
      javonetHandle.explicitInterface("Cassia.ITerminalServer").invoke("Close");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IList<ITerminalServicesProcess> GetProcesses() {
    try {
      Object res = javonetHandle.explicitInterface("Cassia.ITerminalServer").invoke("GetProcesses");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ITerminalServicesProcess GetProcess(java.lang.Integer processId) {
    try {
      Object res =
          javonetHandle.explicitInterface("Cassia.ITerminalServer").invoke("GetProcess", processId);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Shutdown(ShutdownType type) {
    try {
      javonetHandle
          .explicitInterface("Cassia.ITerminalServer")
          .invoke("Shutdown", NEnum.fromJavaEnum(type));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
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
