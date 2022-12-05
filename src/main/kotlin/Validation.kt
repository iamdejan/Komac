enum class Validation {
    Blank,
    InvalidLength { override fun toString(): String = "Invalid Length" },
    InvalidPattern { override fun toString(): String = "Invalid Pattern" },
    UnsuccessfulResponseCode { override fun toString(): String = "Unsuccessful Response Code" },
    InvalidArchitecture { override fun toString(): String = "Invalid Architecture" },
    InvalidInstallerType { override fun toString(): String = "Invalid Installer Type" },
    Success,
}