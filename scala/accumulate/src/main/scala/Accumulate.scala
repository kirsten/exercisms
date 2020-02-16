import scala.annotation.tailrec

class Accumulate {
  def accumulate[A, B](f: (A) => B, list: List[A]): List[B] = {

    @tailrec
    def transformList(originalList: List[A], newList: List[B]): List[B] = {
      if (originalList.isEmpty) newList
      else transformList(originalList.tail, f(originalList.head) :: newList)
    }

    transformList(list, List[B]()).reverse
  }
}
