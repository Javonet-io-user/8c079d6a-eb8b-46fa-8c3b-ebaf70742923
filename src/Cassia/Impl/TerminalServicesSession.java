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
import jio.System.*;
import jio.System.Collections.Generic.*;
import jio.System.Net.*;
import jio.System.Security.Principal.*;

public class TerminalServicesSession implements ITerminalServicesSession {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public IClientDisplay getClientDisplay() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Cassia.ITerminalServicesSession")
              .invoke("get_ClientDisplay");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getClientBuildNumber() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("Cassia.ITerminalServicesSession")
              .invoke("get_ClientBuildNumber");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ITerminalServer getServer() {
    try {
      Object res =
          javonetHandle.explicitInterface("Cassia.ITerminalServicesSession").invoke("get_Server");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IPAddress getClientIPAddress() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Cassia.ITerminalServicesSession")
              .invoke("get_ClientIPAddress");
      if (res == null) return null;
      return new IPAddress((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getWindowStationName() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Cassia.ITerminalServicesSession")
              .invoke("get_WindowStationName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDomainName() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Cassia.ITerminalServicesSession")
              .invoke("get_DomainName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public NTAccount getUserAccount() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Cassia.ITerminalServicesSession")
              .invoke("get_UserAccount");
      if (res == null) return null;
      return new NTAccount((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getClientName() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Cassia.ITerminalServicesSession")
              .invoke("get_ClientName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ConnectionState getConnectionState() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Cassia.ITerminalServicesSession")
              .invoke("get_ConnectionState");
      if (res == null) return null;
      return ConnectionState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getConnectTime() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Cassia.ITerminalServicesSession")
              .invoke("get_ConnectTime");
      if (res == null) return null;
      return new Nullable<DateTime>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getCurrentTime() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Cassia.ITerminalServicesSession")
              .invoke("get_CurrentTime");
      if (res == null) return null;
      return new Nullable<DateTime>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getDisconnectTime() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Cassia.ITerminalServicesSession")
              .invoke("get_DisconnectTime");
      if (res == null) return null;
      return new Nullable<DateTime>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getLastInputTime() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Cassia.ITerminalServicesSession")
              .invoke("get_LastInputTime");
      if (res == null) return null;
      return new Nullable<DateTime>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getLoginTime() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Cassia.ITerminalServicesSession")
              .invoke("get_LoginTime");
      if (res == null) return null;
      return new Nullable<DateTime>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public TimeSpan getIdleTime() {
    try {
      Object res =
          javonetHandle.explicitInterface("Cassia.ITerminalServicesSession").invoke("get_IdleTime");
      if (res == null) return null;
      return new TimeSpan((NObject) res);
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
              .explicitInterface("Cassia.ITerminalServicesSession")
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
  public java.lang.String getUserName() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Cassia.ITerminalServicesSession").invoke("get_UserName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public TerminalServicesSession(ITerminalServer server, java.lang.Integer sessionId) {
    try {
      javonetHandle = Javonet.New("Cassia.Impl.TerminalServicesSession", server, sessionId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TerminalServicesSession(
      ITerminalServer server,
      java.lang.Integer sessionId,
      java.lang.String windowStationName,
      ConnectionState connectionState) {
    try {
      javonetHandle =
          Javonet.New(
              "Cassia.Impl.TerminalServicesSession",
              server,
              sessionId,
              windowStationName,
              NEnum.fromJavaEnum(connectionState));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TerminalServicesSession(ITerminalServer server, WTS_SESSION_INFO sessionInfo) {
    try {
      javonetHandle = Javonet.New("Cassia.Impl.TerminalServicesSession", server, sessionInfo);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TerminalServicesSession(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Logoff() {
    try {
      javonetHandle.explicitInterface("Cassia.ITerminalServicesSession").invoke("Logoff");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Logoff(java.lang.Boolean synchronous) {
    try {
      javonetHandle
          .explicitInterface("Cassia.ITerminalServicesSession")
          .invoke("Logoff", synchronous);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Disconnect() {
    try {
      javonetHandle.explicitInterface("Cassia.ITerminalServicesSession").invoke("Disconnect");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Disconnect(java.lang.Boolean synchronous) {
    try {
      javonetHandle
          .explicitInterface("Cassia.ITerminalServicesSession")
          .invoke("Disconnect", synchronous);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void MessageBox(java.lang.String text) {
    try {
      javonetHandle.explicitInterface("Cassia.ITerminalServicesSession").invoke("MessageBox", text);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void MessageBox(java.lang.String text, java.lang.String caption) {
    try {
      javonetHandle
          .explicitInterface("Cassia.ITerminalServicesSession")
          .invoke("MessageBox", text, caption);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void MessageBox(
      java.lang.String text, java.lang.String caption, RemoteMessageBoxIcon icon) {
    try {
      javonetHandle
          .explicitInterface("Cassia.ITerminalServicesSession")
          .invoke("MessageBox", text, caption, NEnum.fromJavaEnum(icon));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RemoteMessageBoxResult MessageBox(
      java.lang.String text,
      java.lang.String caption,
      RemoteMessageBoxButtons buttons,
      RemoteMessageBoxIcon icon,
      RemoteMessageBoxDefaultButton defaultButton,
      RemoteMessageBoxOptions options,
      TimeSpan timeout,
      java.lang.Boolean synchronous) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Cassia.ITerminalServicesSession")
              .invoke(
                  "MessageBox",
                  text,
                  caption,
                  NEnum.fromJavaEnum(buttons),
                  NEnum.fromJavaEnum(icon),
                  NEnum.fromJavaEnum(defaultButton),
                  NEnum.fromJavaEnum(options),
                  timeout,
                  synchronous);
      if (res == null) return null;
      return RemoteMessageBoxResult.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IList<ITerminalServicesProcess> GetProcesses() {
    try {
      Object res =
          javonetHandle.explicitInterface("Cassia.ITerminalServicesSession").invoke("GetProcesses");
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
