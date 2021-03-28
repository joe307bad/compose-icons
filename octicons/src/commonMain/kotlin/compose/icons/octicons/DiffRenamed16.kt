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

public val Octicons.DiffRenamed16: ImageVector
    get() {
        if (_diffRenamed16 != null) {
            return _diffRenamed16!!
        }
        _diffRenamed16 = Builder(name = "DiffRenamed16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.75f, 2.5f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(10.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                lineTo(2.75f, 13.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                lineTo(2.5f, 2.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                close()
                moveTo(13.25f, 1.0f)
                lineTo(2.75f, 1.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 1.0f, 2.75f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(10.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 15.0f, 13.25f)
                lineTo(15.0f, 2.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 13.25f, 1.0f)
                close()
                moveTo(11.78f, 8.53f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.06f)
                lineTo(8.53f, 4.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(1.97f, 1.97f)
                lineTo(4.75f, 7.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(4.69f)
                lineToRelative(-1.97f, 1.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineToRelative(3.25f, -3.25f)
                close()
            }
        }
        .build()
        return _diffRenamed16!!
    }

private var _diffRenamed16: ImageVector? = null
