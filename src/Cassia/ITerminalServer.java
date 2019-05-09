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
import jio.System.*;

public interface ITerminalServer extends IDisposable {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IList<ITerminalServicesSession> GetSessions();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ITerminalServicesSession GetSession(java.lang.Integer sessionId);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Open();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Close();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IList<ITerminalServicesProcess> GetProcesses();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ITerminalServicesProcess GetProcess(java.lang.Integer processId);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Shutdown(ShutdownType type);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Dispose();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public ITerminalServerHandle getHandle();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsOpen();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getServerName();
}
