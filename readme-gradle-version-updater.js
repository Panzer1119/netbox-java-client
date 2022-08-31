function versionRegex(contents) {
    return RegExp('(implementation|compile)\\s+(["\'])de\\.codemakers\\.netbox:netbox-java-client:(.+?)["\']', 'mi')
}

module.exports.readVersion = function (contents) {
    const matches = versionRegex(contents).exec(contents)
    if (matches === null) {
        throw new Error('Failed to read the gradle version field in your README.md file - is it present?')
    }
    return matches[3]
}

module.exports.writeVersion = function (contents, version) {
    return contents.replace(versionRegex(contents), (match, keyword, quotes) => {
        return `${keyword} ${quotes}de.codemakers.netbox:netbox-java-client:${version}${quotes}`
    })
}