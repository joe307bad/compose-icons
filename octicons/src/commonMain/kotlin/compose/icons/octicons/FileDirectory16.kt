package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.FileDirectory16: ImageVector
    get() {
        if (_fileDirectory16 != null) {
            return _fileDirectory16!!
        }
        _fileDirectory16 = Builder(name = "FileDirectory16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.75f, 1.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 0.0f, 2.75f)
                verticalLineToRelative(10.5f)
                curveTo(0.0f, 14.216f, 0.784f, 15.0f, 1.75f, 15.0f)
                horizontalLineToRelative(12.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 16.0f, 13.25f)
                verticalLineToRelative(-8.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 14.25f, 3.0f)
                horizontalLineToRelative(-6.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.2f, -0.1f)
                lineToRelative(-0.9f, -1.2f)
                curveToRelative(-0.33f, -0.44f, -0.85f, -0.7f, -1.4f, -0.7f)
                horizontalLineToRelative(-3.5f)
                close()
            }
        }
        .build()
        return _fileDirectory16!!
    }

private var _fileDirectory16: ImageVector? = null
