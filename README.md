# meta-influx
This Yocto meta layer contains all the recipes needed to build the TICK Stack (Telegraf, InfluxDB, Chronograf, Kapacitor) into a Yocto image for ARM architecture.

## Usage
- Add **meta-influx** layer to your **bblayers.conf** file

- Add following to your **local.conf**

        DISTRO_FEATURES_append = " systemd"
        VIRTUAL-RUNTIME_init_manager = "systemd"
        DISTRO_FEATURES_BACKFILL_CONSIDERED = "sysvinit"
        VIRTUAL-RUNTIME_initscripts = ""

- Then, add following line to your local.conf to use **Telegraf, InfluxDB, Chronograf** and **Kapacitor** 

        IMAGE_INSTALL_append = "telegraf influxdb chronograf kapacitor"

-  Run `bitbake <image name>`

## Tested Hardware
- raspberrypi3

## Tested Yocto Project Releases:
- zeus (3.0)