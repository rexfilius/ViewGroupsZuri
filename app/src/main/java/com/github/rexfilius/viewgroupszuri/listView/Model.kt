package com.github.rexfilius.viewgroupszuri.listView

import com.github.rexfilius.viewgroupszuri.R

data class FunFact(val name: String, val logo: Int, val fact: String)

object FunFactData {

    val items = listOf(
        FunFact(
            "Kotlin",
            R.drawable.kotlin_logo,
            "The name comes from Kotlin Island, near St Petersburg. Andrey Breslav mentioned that the team decided to name it after an island, just like Java was named after the Indonesian island of Java."
        ),
        FunFact(
            "Java",
            R.drawable.java_logo,
            "The language was initially called Oak after an oak tree that stood outside Gosling's office. Later the project went by the name Green and was finally renamed Java, from Java coffee, a type of coffee from Indonesia."
        ),
        FunFact(
            "Python",
            R.drawable.python_logo,
            "Python's name is derived from the British comedy group Monty Python, whom Python creator Guido van Rossum enjoyed while developing the language."
        ),
        FunFact(
            "JavaScript",
            R.drawable.js_logo,
            "The name JavaScript came from Netscape's support of Java applets within its browser."
        ),
        FunFact(
            "PHP",
            R.drawable.php_logo,
            "PHP originally stood for Personal Home Page, but it now stands for the recursive initialism PHP: Hypertext Preprocessor"
        )
    )
}