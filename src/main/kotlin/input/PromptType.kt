package input

enum class PromptType {
    Architecture,
    Publisher,
    Commands,
    CustomSwitch,
    FileExtensions,
    InstallerLocale,
    InstallerSuccessCodes,
    InstallerType,
    InstallerUrl,
    InstallModes,
    PackageIdentifier,
    PackageLocale,
    PackageVersion,
    ProductCode,
    Protocols,
    ReleaseDate,
    SilentSwitch,
    SilentWithProgressSwitch;

    override fun toString() = name.replace(Regex("([A-Z])"), " $1").trim()
}
