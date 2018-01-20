// package

import java.util

// java.util.concurrent.locks.ReentrantLock
//
// java.util
//      util.concurrent
//           concurrent.locks
//                      locks.ReentrantLock

object Demo8
{
  import util.concurrent
  def main(args: Array[String])
  {
    import concurrent.locks
    if (1 > 0)
    {
      import locks.ReentrantLock
      if(2 > 1)
      {
        val x = new ReentrantLock()
      }
    }
  }
}