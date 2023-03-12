package input

enum class ManifestResultOption {
    PullRequest,
    WriteToFiles,
    Quit;

    override fun toString() = name.replace("([A-Z])".toRegex(), " $1").trim()
}
