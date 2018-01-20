// package

import java.{util => U}

object Demo9
{
  import U.{concurrent => C}

  def main(args: Array[String])
  {
    import C.{locks => L}
    if (1 > 0)
    {
      import L.{ReentrantLock => RL}
      if (2 > 1)
      {
        val x = new RL()
      }
    }
  }
}