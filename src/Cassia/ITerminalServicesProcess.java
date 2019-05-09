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
import jio.System.Security.Principal.*;
import jio.System.Diagnostics.*;

public interface ITerminalServicesProcess {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Kill();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void Kill(java.lang.Integer exitCode);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getSessionId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getProcessId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getProcessName();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public SecurityIdentifier getSecurityIdentifier();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public ITerminalServer getServer();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Diagnostics.Process getUnderlyingProcess();
}
