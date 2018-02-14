package jp

import jp.co.camnet.xxxx.gb.Guestbook

/**
  * @author ${user.name}
  */
object App {

  def foo(x: Array[String]) = x.foldRight("")((a, b) => b + a)

  def bar(x: Array[String]) = x.foldLeft("")((a, b) => b + a)

  def main(args: Array[String]) {
    println("Hello World!")
    var aaa = Array("a", "b","c","d","e");
    println("concat arguments = " + foo(aaa))
    println("concat arguments = " + bar(aaa))
    val book = new Guestbook;
    book.book = ""
  }

}
