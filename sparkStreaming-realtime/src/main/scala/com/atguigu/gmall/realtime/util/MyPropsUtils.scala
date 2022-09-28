package com.atguigu.gmall.realtime.util

/**
 * java.util.ResourceBundle:这个类的作用就是读取资源属性文件(properties)
 * 然后根据.properties文件的名称信息(本地化信息)，匹配当前系统的国别语言信息(也可以程序指定)，然后获取相应的properties文件的内容。
 */
import java.util.ResourceBundle

/**
  * 配置文件解析类
  */
object MyPropsUtils {

  private val bundle: ResourceBundle = ResourceBundle.getBundle("config")


  /**
   * 在scala中没有static,使用关键字Object来实现单例模式,Object对象不能带参数
   * 可以通过对象.方法或者对象.成员变量
   *
   *对于apply方法,可以直接调用,不用对象.方法名(又名:语法糖)
   * package Onedayhelloscala
   * object TestApply {
   * def apply(food:String) ={
   * println("吃食物"+food)
   * }
   * }
   * 调用 ：
   *  TestApply("中饭")
   *
   * @param propsKey
   * @return
   */

  def apply(propsKey: String) : String ={
    bundle.getString(propsKey)
  }

  def main(args: Array[String]): Unit = {
    println(MyPropsUtils("kafka.bootstrap-servers"))
  }
}
