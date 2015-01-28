package org.zhaoyu.base

/**
 * Created by Administrator on 2015/1/26.
 */
class DelimitContext {
  def firstLast[A,C] (it: C) (implicit ev: C <:< Iterable[A]) =
    (it.head,it.last)
}
class Pair[T: Ordering](val first: T, val second: T) {
  def smaller(implicit ord: Ordering[T]) =
      if(ord.compare(first,second) < 0) first else second
}
class Pair1[T: Ordering](val first: T, val second: T) {
  def smaller =
      if(implicitly[Ordering[T]].compare(first,second) < 0) first else second
}
class Pair3[T: Ordering](val first: T, val second: T) {
  def smaller = {
    import Ordered._
    if(first < second) first else second
  }
}