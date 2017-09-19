package org.http4s
package server
package tomcat

import cats.effect.IO
import org.apache.catalina.webresources.TomcatURLStreamHandlerFactory

class TomcatServerSpec extends ServerSpec {
  val builder = TomcatBuilder[IO]

  // Prevents us from loading jar and war URLs, but lets us
  // run Tomcat twice in the same JVM.  This makes me grumpy.
  TomcatURLStreamHandlerFactory.disable()
}
