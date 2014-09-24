global = if exports? then exports else window

global.responseFor = (query) -> "Unknown Query #{query}"