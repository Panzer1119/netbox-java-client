function versionRegex (contents) {
    return RegExp('(?:implementation|compile) ["\']de\.codemakers\.netbox:netbox-java-client:(.+?)["\']', 'm')
}

function replaceRegex (contents) {
    return RegExp('(implementation|compile) (["\'])de\.codemakers\.netbox:netbox-java-client:(.+?)["\']', 'm')
}

module.exports.readVersion = function (contents) {
    const matches = versionRegex(contents).exec(contents)
    if (matches === null) {
        throw new Error('Failed to read the gradle version field in your README.md file - is it present?')
    }
    return matches[1]
}

module.exports.writeVersion = function (contents, version) {
    return contents.replace(replaceRegex(contents), () => {
        return `$1 $2de.codemakers.netbox:netbox-java-client:${version}$2`
    })
}