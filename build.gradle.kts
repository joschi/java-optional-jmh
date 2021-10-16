plugins {
    java
    id("me.champeau.jmh") version "0.6.6"
}

repositories {
    mavenCentral()
}

dependencies {
    jmh("io.vavr:vavr:0.10.4")
}

jmh {
    jmhVersion.set("1.33")
}
