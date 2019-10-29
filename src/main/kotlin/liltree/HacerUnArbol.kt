package liltree

data class Respuesta(val statusCode: Int, val body: String)

fun responder(cuerpo: String) = Respuesta(200, cuerpo)

private val String.inlined: String
    get() = """
        ```
        $this
        ```
    """.trimIndent()

val arbolito = """
    
+ - - - - - - - - - - - - - - - - - - - - - - - +
|                       O                       |
|                      ***                      |
|                     **O**                     |
|                    *******                    |
|                   *********                   |
|                  ***********                  |
|                   ******o**                   |
|                  ***********                  |
|                 ****o********                 |
|                ***************                |
|               ****o***o********               |
|              *******************              |
|            ***********************            |
|               *****O***********               |
|              **********o********              |
|             ****************o****             |
|            **O********************            |
|           ***********o********O****           |
|         *****************************         |
|             *********************             |
|            ***o*******************            |
|           ***********o*******o*****           |
|          ***************************          |
|         ***********************O*****         |
|        ***O***************************        |
|      ***********************************      |
|           *************************           |
|          *******o********o**********          |
|         *****************************         |
|        **************o****************        |
|       *************************O*******       |
|      *****O*****************************      |
|    **************o************************    |
|          ***************************          |
|         *************o***************         |
|        ***********o*******************        |
|       **************************O******       |
|      ***o******************O************      |
|    ***o***********o****************o******    |
|                      ###                      |
|                      ###                      |
|                      ###                      |
|                  ###########                  |
|                  ###########                  |
+ - - - - - - - - - - - - - - - - - - - - - - - +
|                 Hecho con amor                |
+ - - - - - - - - - - - - - - - - - - - - - - - +
""".trimIndent()


class HacerUnArbol {
    fun apply() = responder(arbolito)
}
