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

public interface ITerminalServicesManager {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IList<ITerminalServicesSession> GetSessions(java.lang.String serverName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IList<ITerminalServicesSession> GetSessions();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ITerminalServer GetRemoteServer(java.lang.String serverName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public ITerminalServer GetLocalServer();
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public IList<ITerminalServer> GetServers(java.lang.String domainName);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public ITerminalServicesSession getCurrentSession();
}
