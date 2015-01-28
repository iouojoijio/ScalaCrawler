package org.zhaoyu.actor

import akka.actor.{Actor, Props, ActorSystem}

/**
 * Created by Administrator on 2015/1/23.
 */
object ActorPath extends App{
  val system = ActorSystem("ActorPath")
  val actor = system.actorOf(Props(new Actor {
    def receive = {
      case _ =>
    }
  }),"AnonymousActor")
  println(actor.path)
  println(actor.path.elements.mkString("/","/",""))
  println(actor.path.name)
}
