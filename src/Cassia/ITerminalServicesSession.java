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
import jio.System.*;
import jio.System.Collections.Generic.*;
import jio.System.Security.Principal.*;
import jio.System.Net.*;

public interface ITerminalServicesSession {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Logoff();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Logoff(java.lang.Boolean synchronous);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Disconnect();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Disconnect(java.lang.Boolean synchronous);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void MessageBox(java.lang.String text);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void MessageBox(java.lang.String text, java.lang.String caption);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void MessageBox(
      java.lang.String text, java.lang.String caption, RemoteMessageBoxIcon icon);
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
      java.lang.Boolean synchronous);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IList<ITerminalServicesProcess> GetProcesses();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getClientName();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public ConnectionState getConnectionState();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getConnectTime();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getCurrentTime();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getDisconnectTime();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getLastInputTime();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getLoginTime();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public TimeSpan getIdleTime();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getSessionId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getUserName();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDomainName();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public NTAccount getUserAccount();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getWindowStationName();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IPAddress getClientIPAddress();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public ITerminalServer getServer();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getClientBuildNumber();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IClientDisplay getClientDisplay();
}
