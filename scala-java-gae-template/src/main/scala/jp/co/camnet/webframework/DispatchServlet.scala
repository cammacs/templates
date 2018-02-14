package jp.co.camnet.webframework

import java.io.IOException
import javax.servlet.ServletException
import javax.servlet.http.{HttpServlet, HttpServletRequest, HttpServletResponse}


class DispatchServlet extends HttpServlet {


  @throws[ServletException]
  @throws[IOException]
  override def doGet(req: HttpServletRequest, resp: HttpServletResponse): Unit = {
    println(req.getRequestURI)
    println(req.getRequestURL)
    super.doGet(req, resp)
  }

  @throws[IOException]
  override def doPost(req: HttpServletRequest, resp: HttpServletResponse): Unit = {

  }

  @throws[ServletException]
  @throws[IOException]
  override def doPut(req: HttpServletRequest, resp: HttpServletResponse): Unit = {
    super.doPut(req, resp)
  }


  @throws[ServletException]
  @throws[IOException]
  override def doDelete(req: HttpServletRequest, resp: HttpServletResponse): Unit = {
    super.doDelete(req, resp)
  }

  @throws[ServletException]
  @throws[IOException]
  override def doTrace(req: HttpServletRequest, resp: HttpServletResponse): Unit = {
    super.doTrace(req, resp)
  }


}
