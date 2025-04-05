# MineWebhook — Discord Webhooks in Minecraft

## Features

- **Simple Discord Integration**: Send messages from Minecraft to Discord with one command
- **Multiple Webhook Support**: Configure and switch between different webhooks easily
- **In-Game Management**: Reload configurations without server restart
- **Permission Control**: Granular access control for different users

## Installation

1. Download the latest `MineWebhook.jar`
2. Place the file in your server's `plugins/` folder
3. Restart your server
4. Configure your webhooks in `plugins/MineWebhook/config.yml`

## Basic Usage

### Sending Messages
```
/webhook <webhook_name> <message>
```
Example: `/webhook alerts Player joined the game!`

### Managing Configurations
```
/minewebhook reload
```
*Reloads the configuration without server restart*

## Configuration

Edit `plugins/MineWebhook/config.yml`:
```yaml
webhooks:
  testWebhook: "https://discord.com/api/webhooks/your-webhook-url"
  notifications: "https://discord.com/api/webhooks/another-webhook-url"
```

## Permissions

| Permission | Description | Default |
|------------|-------------|---------|
| `minewebhook.send` | Allows sending webhooks | op |
| `minewebhook.reload` | Allows reloading config | op |

## Support

Created by [Pasha Void](https://www.youtube.com/@pasha-void)

For support or feature requests, please [open an issue](https://github.com/Kiyoshi-Yeager/MineWebhook) on our GitHub repository.

---

**Note**: This plugin requires Spigot/Paper 1.21+ and internet access to communicate with Discord's API. 
