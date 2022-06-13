:warning: **Note:** i40-aas-type2 has been archived and will no longer be maintained by the community. The Open Source implementations of the specification "Details of the AssetAdministrationShell" Part 2 are carried out in the AAS Cloud Repository (currently admin-shell.io/aas-cloud-repository) in the context of the activities within the [Industrial Digital Twin Association (IDTA)](https://industrialdigitaltwin.org/) and [Eclipse Digital Twin Top-Level Project](https://projects.eclipse.org/projects/dt). 

-	IDTA AAS Cloud Repository (currently admin-shell.io/aas-cloud-repository) provides a reference implementation for the AAS Repository based on the API specifications of the Asset Administration Shell (AAS). It creates the foundation for applications and services providing “AAS-as-a-Service”.

By working within the [Eclipse Digital Twin Top-Level Project](https://projects.eclipse.org/projects/dt), we have bigger Open Source community backed up by the Eclipse Foundation to bring Digital Twins based on AAS to the next level.

Looking forward to seeing in the [Eclipse AAS Model for Java (AAS4J)](https://projects.eclipse.org/projects/dt.aas4j) and IDTA AAS Cloud Repository (currently admin-shell.io/aas-cloud-repository) !


<h1 align="center">
  i40-aas-type2
</h1>

<div align="center">
    <img alt="REUSE status" src="https://api.reuse.software/badge/github.com/SAP/i40-aas-type2" />
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/SAP/i40-aas-type2" />
    <img alt="Repository Size" src="https://img.shields.io/github/repo-size/SAP/i40-aas-type2" />
    <img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-green.svg" />
</div>

<div align="center">

  ### ⚠️ **i40-aas-type2** is **alpha** ⚠️

</div>

<div align="center">

  **i40-aas-type2** welcomes [contributions](#contributing). Please read about [known issues](#known-issues) and [upcoming changes](#upcoming-changes).

</div>

## Contents

- [i40-aas-type2](#i40-aas-type2)
  - [Contents](#contents)
  - [Main Features](#main-features)
  - [Prerequisites](#prerequisites)
  - [Instructions](#instructions)
    - [Getting Started](#getting-started)
  - [Configuration](#configuration)
  - [Known Issues](#known-issues)
  - [Get Support](#get-support)
  - [Contributing](#contributing)
  - [Upcoming Changes](#upcoming-changes)
  - [License](#license)

## Main Features

The AAS-Service provides an implementation of the RAMI 4.0 reference architecture as specified by [Plattform Industrie 4.0](https://www.plattform-i40.de/PI40/Redaktion/DE/Downloads/Publikation/Details-of-the-Asset-Administration-Shell-Part1.html). Main features include:

Following that, we provide the implementation of an asset administration shell type 2.

## Prerequisites

You need to install [Docker](https://www.docker.com) and [Docker Compose](https://docs.docker.com/compose/). Docker Compose comes with Docker if you're on Mac or Windows ([check here for Linux](https://docs.docker.com/compose/install/)). Check the installation by executing:

```bash
$ docker --version
## tested with: 19.03.8

$ docker-compose version
## tested with: 1.25.4, build 8d51620a
```

For easier usage, install Make and verify as follows:

```bash
$ make --version
## tested with: GNU Make 3.81
```

Optionally, you can download and install [Postman](https://www.getpostman.com) to [test the services](docs/markdown/test.md).

## Instructions

### Getting Started

Service interactions can be deployed, tested and developed locally using Docker Compose as described below. For further instructions & information about **i40-aas-type2** check [the documentation](docs/README.md)

#### Run **i40-aas-type2** locally

Build the *data-manager* image from source first, then pull external dependencies and continue to run everything.

```bash
## build i40-aas images
$ make

## 'up' (start) the composed setup
$ make install
```

Once done, one can stop & clean up (also removes all images related to *i40-aas-type2*!) locally by executing:

```bash
$ make clean
```

## Configuration

The local setup uses the default configurations specified in the `.env` file.

## Known Issues

<!--- Please list all known issues, or bugs, here. Even if the project is provided "as-is" any known problems should be listed. --->

Please refer to the list of [issues](https://github.com/SAP/i40-aas-type2/issues) on GitHub.

## Get Support

<!--- This section should contain details on how the outside user can obtain support, ask questions, or post a bug report on your project. If your project is provided "as-is", with no expected changes or support, you must state that here. --->

Please study the [help provided](docs/README.md) and use the [GitHub issue tracker](https://github.com/SAP/i40-aas-type2/issues) for further assistance, bug reports or feature requests.

## Contributing

<!--- Details on how external developers can contribute to your code should be posted here. You can also link to a dedicated CONTRIBUTING.md file. See further details here. --->

You are welcome to join us in our efforts to improve and increase the set of tools to realize the Asset Administration Shell for Industrie 4.0!

Simply check the [Contribution Guidelines](CONTRIBUTING.md).

## Upcoming Changes

<!--- Details on any expected changes in later versions. If your project is released "as-is", or you know of no upcoming changes, this section can be omitted. --->

This project follows the specification ["Details of the AssetAdministrationShell"](https://www.plattform-i40.de/PI40/Redaktion/EN/Downloads/Publikation/2018-details-of-the-asset-administration-shell.html) part 1 version 1.0, which is work in progress. As the specification changes, so will this project.

## License

Copyright (c) 2020-2021 SAP SE or an SAP affiliate company and *i40-aas-type2* contributors. All rights reserved. This repository is licensed as noted in [LICENSE](LICENSE). Detailed information including third-party components and their licensing/copyright information is available [via the REUSE tool](https://api.reuse.software/info/github.com/SAP/i40-aas-type2)

Please note that Docker images can contain other software which may be licensed under different licenses. This License file is also included in the Docker image. For any usage of built Docker images please make sure to check the licenses of the artifacts contained in the images.
