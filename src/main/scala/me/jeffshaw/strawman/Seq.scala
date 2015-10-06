package me.jeffshaw.strawman

import com.gs.collections.api.list.ImmutableList
import com.gs.collections.impl.factory.Lists

trait Seq[+A] extends ImmutableList[A] {

  def head: A = getFirst()

  def iterator: Iterator[A] = super.listIterator()

}

object Seq {
  def empty[A] = new Seq[A] {
    override val underlying: ImmutableList[A] = Lists.immutable.empty[A]()
  }
}
