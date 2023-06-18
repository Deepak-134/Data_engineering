# Scala

## Declare Variables And Types

   1) Immutable variables :- Variables whose value cannot be changed.
    val <Name of our variable>: <Scala type> = <Some literal>
    Ex. val empid: int = 100
        empid = 200 -------> It will throw error as variable is declared as immutable.
    
    2) Mutable variables :- Variables whose value can be changed, which are used in loops for increament purpose.
    var <Name of our variable>: <Scala type> = <Some literal>
    Ex. var count: int = 0
        var sum: int = 0
        count = 100 ---------> New value will be assigned , as variable is declared as mutable.
    
    3) Lazy initialization :- Sometimes you may wish to delay the initialization of some variable until at the point where it is consumed by your application.
       lazy val donutService = "initialize some donut service" 
    
    4) Scala Supported Types :- 
        val donutsBought: Int = 5
        val bigNumberOfDonuts: Long = 100000000L
        val smallNumberOfDonuts: Short = 1
        val priceOfDonut: Double = 2.50
        val donutPrice: Float = 2.50f
        val donutStoreName: String = "allaboutscala Donut Store"
        val donutByte: Byte = 0xa
        val donutFirstLetter: Char = 'D'
        val nothing: Unit = ()
    
    5) Declare a variable with no initialization :- If you do not want to assign value to vaiable at declariation and assign later on then use '_' .
        var phone: string = _
        phone = [9049619621]
    
    
    


