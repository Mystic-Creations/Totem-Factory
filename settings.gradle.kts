file(".").listFiles {
  file -> file.isDirectory && (
    file.resolve("build.gradle").exists() || file.resolve("build.gradle.kts").exists()
  )
}.forEach { includeBuild(it.name) }
