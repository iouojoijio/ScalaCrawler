package org.zhaoyu.base

/**
 * Created by Administrator on 2015/1/28.
 */
class Holder[+T] (initialValue: Option[T]) {
  private[this] var value = initialValue
  def getValue = value
  def makeEmpty { value = None }
}
