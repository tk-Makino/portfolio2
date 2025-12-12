# Download Japanese fonts
$fontDir = "composeApp\src\webMain\composeResources\font"

# Noto Serif JP (明朝体)
Invoke-WebRequest -Uri "https://github.com/google/fonts/raw/main/ofl/notoserijp/NotoSerifJP%5Bwght%5D.ttf" -OutFile "$fontDir\NotoSerifJP.ttf"
Write-Host "Downloaded NotoSerifJP.ttf"

# M PLUS 1p Regular
Invoke-WebRequest -Uri "https://github.com/google/fonts/raw/main/ofl/mplus1p/MPLUS1p-Regular.ttf" -OutFile "$fontDir\MPLUS1p-Regular.ttf"
Write-Host "Downloaded MPLUS1p-Regular.ttf"

# M PLUS 1p Bold
Invoke-WebRequest -Uri "https://github.com/google/fonts/raw/main/ofl/mplus1p/MPLUS1p-Bold.ttf" -OutFile "$fontDir\MPLUS1p-Bold.ttf"
Write-Host "Downloaded MPLUS1p-Bold.ttf"

# Zen Kaku Gothic New
Invoke-WebRequest -Uri "https://github.com/google/fonts/raw/main/ofl/zenkakugothicnew/ZenKakuGothicNew-Regular.ttf" -OutFile "$fontDir\ZenKakuGothicNew-Regular.ttf"
Write-Host "Downloaded ZenKakuGothicNew-Regular.ttf"

Write-Host "All fonts downloaded successfully!"

