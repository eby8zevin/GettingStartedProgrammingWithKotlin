package kotlinFunctionalProgramming

fun main() {

    println(
        "val list = getListUser()\n" +
                "\n" +
                "// oop\n" +
                "fun getUserName(): List<String> {\n" +
                "    val name = mutableListOf<String>()\n" +
                "    for (user in list) {\n" +
                "        name.add(user.name)\n" +
                "    }\n" +
                "    return name;\n" +
                "}\n" +
                "\n" +
                "// functional\n" +
                "fun getUserName1(): List<String> {\n" +
                "    return list.map {\n" +
                "        it.name\n" +
                "    }\n" +
                "}"
    )
}

