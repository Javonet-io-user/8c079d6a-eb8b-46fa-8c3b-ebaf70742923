package Cassia;

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
import Cassia.*;
import jio.System.Collections.Generic.*;

public class TerminalServicesManager implements ITerminalServicesManager {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public ITerminalServicesSession getCurrentSession() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Cassia.ITerminalServicesManager")
              .invoke("get_CurrentSession");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public TerminalServicesManager() {
    try {
      javonetHandle = Javonet.New("Cassia.TerminalServicesManager");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TerminalServicesManager(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IList<ITerminalServicesSession> GetSessions(java.lang.String serverName) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Cassia.ITerminalServicesManager")
              .invoke("GetSessions", serverName);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IList<ITerminalServicesSession> GetSessions() {
    try {
      Object res =
          javonetHandle.explicitInterface("Cassia.ITerminalServicesManager").invoke("GetSessions");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ITerminalServer GetRemoteServer(java.lang.String serverName) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Cassia.ITerminalServicesManager")
              .invoke("GetRemoteServer", serverName);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public ITerminalServer GetLocalServer() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Cassia.ITerminalServicesManager")
              .invoke("GetLocalServer");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IList<ITerminalServer> GetServers(java.lang.String domainName) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Cassia.ITerminalServicesManager")
              .invoke("GetServers", domainName);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
