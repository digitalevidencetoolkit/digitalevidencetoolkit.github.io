# The Digital Evidence Toolkit website

Built with [perun.io](https://perun.io/), a collection of Boot tasks helping the creation of static sites.

## Development

(`boot` has an issue with Big Sur – you must [build from `master`](https://github.com/boot-clj/boot#install) if you're on this OS)

To start serving the files and editing with live reload, fire up:

`$ boot dev`

To generate all static assets into `/target`:

`$ boot build target`

## Development with Docker

Build the Docker image to reproduce the development environment, including Java 8, Boot, and some Node dependencies:

`$ docker build -t perun-serve .`

Once built, the image can be used to run the environment. File sharing between the host and the container is required:

`$ docker run -v <path-to-repo>:/perun -p 3000:3000 perun-serve`
