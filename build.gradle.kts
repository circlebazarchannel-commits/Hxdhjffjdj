import java.net.URL

tasks.register("fetchSupabaseVersion") {
    doLast {
        try {
            val xml = URL("https://repo1.maven.org/maven2/io/github/jan-tennert/supabase/bom/maven-metadata.xml").readText()
            println("=== SUPABASE BOM TENNER METADATA ===")
            println(xml)
        } catch (e: Exception) {
            println("Error tenner: ${e.message}")
        }
        
        try {
            val xml2 = URL("https://repo1.maven.org/maven2/io/github/jan-supabase/bom/maven-metadata.xml").readText()
            println("=== SUPABASE BOM JAN METADATA ===")
            println(xml2)
        } catch (e: Exception) {
            println("Error jan: ${e.message}")
        }
    }
}
plugins {
  alias(libs.plugins.android.application) apply false
  alias(libs.plugins.kotlin.android) apply false
  alias(libs.plugins.kotlin.compose) apply false
  alias(libs.plugins.google.devtools.ksp) apply false
  alias(libs.plugins.roborazzi) apply false
  alias(libs.plugins.secrets) apply false
  alias(libs.plugins.google.services) apply false
  alias(libs.plugins.kotlinx.serialization) apply false
}
