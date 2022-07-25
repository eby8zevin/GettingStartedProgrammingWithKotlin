package konsepObjectOrientedProgramming

import kotlin.reflect.KProperty

class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>): String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String) {
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animal1 {
    var name: String by DelegateName()
}

class Person1 {
    var name: String by DelegateName()
}

class Hero1 {
    var name: String by DelegateName()
}

// Any
class DelegateGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animal2 {
    var name: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}

fun main() {

    val animal = Animal1()
    animal.name = "Dicoding Miaw"
    println("Nama Hewan ${animal.name}")

    val person = Person1()
    person.name = "Dimas"
    println("Nama Orang: ${person.name}")

    val hero = Hero1()
    hero.name = "Gatotkaca"
    println("Nama Pahlawan: ${hero.name}")

    println()

    val animal2 = Animal2()
    animal2.name = "Dicoding cat"
    animal2.weight = 6.2
    animal2.age = 1

    println("Nama: ${animal2.name}")
    println("Berat: ${animal2.weight}")
    println("Umur: ${animal2.age} Tahun")
}