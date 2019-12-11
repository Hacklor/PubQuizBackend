# PubQuiz Backend
This is the backend that supports the PubQuiz

## Prerequisites

- HomeBrew
- JQ via HomeBrew
- [asdf](https://asdf-vm.com/#/core-manage-asdf-vm)

## Setup

Install dependencies for Java and plugins for `asdf`.
```bash
brew install jq
asdf plugin-add java
asdf plugin-add maven
```

`asdf` automatically installs the correct java and maven versions

```bash
asdf install
mvn clean install
```
